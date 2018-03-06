package com.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import com.chat.Room.ServerReceiver;

public class Room extends Thread{
	private String roomName;
	private int port;
	ServerSocket serverSocket = null;
	private HashMap<String, PrintWriter> clients;
	private boolean flag = true;
	
	public Room() {
	}

	public Room(String roomName, int port) {
		this.port = port;
		this.roomName = roomName;
		clients = new HashMap<>();
		Collections.synchronizedMap(clients); //스레드 동기화
		this.start();
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(this.port); //방마다 서버 소켓 생성
			System.out.println(this.roomName+"방이 만들어졌다.");
			while (flag) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "] 에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addClient(String nickName, PrintWriter out) {
		clients.put(nickName, out);
		sendToAll("#" + nickName + "님이 접속했다.\n");
		System.out.println("#" + nickName + "님이 접속했다.\n");
		sendToAll("현재 접속 인원은" + clients.size() + "명이다.");
		System.out.println("현재 접속 인원은" + clients.size() + "명이다.");
	}

	public void removeClient(String nickName) {
		clients.remove(nickName);
		sendToAll("#" + nickName + "님이 나갔다.\n");
		System.out.println("#" + nickName + "님이 나갔다.\n");
		sendToAll("현재 접속 인원은" + clients.size() + "명이다.");
		System.out.println("현재 접속 인원은" + clients.size() + "명이다.");
		if (clients.size()==0) {
			flag = false;
		}
	}

	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		while (it.hasNext()) {
			try {
				//System.out.println("Send to all : "+msg);
				String nickName = (String)it.next();
				PrintWriter out = (PrintWriter) clients.get(nickName);
				out.println(msg);
				out.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	class ServerReceiver extends Thread { //각 접속 요청마다 하나의 스레드를 내준다.
		String nickName;
		Socket socket;
		BufferedReader in;
		PrintWriter out;
		public ServerReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		@Override
		public void run() { // 스레드 실행.
			// TODO Auto-generated method stub
			try {
				nickName = in.readLine();
				addClient(nickName, out);
				while (in != null) {
					String temp = in.readLine();
					// 명령어를 넣으려면 여기에 if로 처리.
					sendToAll("[" + nickName + "] " + temp);
					if (temp.equals("show")) {
						Iterator it = clients.keySet().iterator();
						while (it.hasNext()) {
							String n = (String) it.next();
							System.out.print(n+"\t");
						}System.out.println();
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				removeClient(nickName);
			}
		}
	}
}

