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
		Collections.synchronizedMap(clients); //������ ����ȭ
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
			serverSocket = new ServerSocket(this.port); //�渶�� ���� ���� ����
			System.out.println(this.roomName+"���� ���������.");
			while (flag) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "] ���� �����Ͽ����ϴ�.");
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
		sendToAll("#" + nickName + "���� �����ߴ�.\n");
		System.out.println("#" + nickName + "���� �����ߴ�.\n");
		sendToAll("���� ���� �ο���" + clients.size() + "���̴�.");
		System.out.println("���� ���� �ο���" + clients.size() + "���̴�.");
	}

	public void removeClient(String nickName) {
		clients.remove(nickName);
		sendToAll("#" + nickName + "���� ������.\n");
		System.out.println("#" + nickName + "���� ������.\n");
		sendToAll("���� ���� �ο���" + clients.size() + "���̴�.");
		System.out.println("���� ���� �ο���" + clients.size() + "���̴�.");
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
	
	class ServerReceiver extends Thread { //�� ���� ��û���� �ϳ��� �����带 ���ش�.
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
		public void run() { // ������ ����.
			// TODO Auto-generated method stub
			try {
				nickName = in.readLine();
				addClient(nickName, out);
				while (in != null) {
					String temp = in.readLine();
					// ��ɾ �������� ���⿡ if�� ó��.
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

