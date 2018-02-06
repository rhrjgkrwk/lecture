package chat.kirau;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


public class ChatKirauServer {
	HashMap clients;

	public ChatKirauServer() {
		// TODO Auto-generated constructor stub
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// 싱크로나이즈드 맵은 한번에 통째로 동기화시키는 것이다.
		// 클라이언트가 새로 들어올때 여기 넣고 관리.
	}

	public static void main(String[] args) {
		new ChatKirauServer().start(7897); //임시포트 7897
	}
	
//////////////서버를 열자(서버 소켓 생성)//////////////
	
	public void start(int port) { // 서버소켓을 만든다.
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(port); // 클라이언트의 연결요청을 관리.
			System.out.println("서버가 시작되었습니다.");
			while (true) {// 무한 루프를 돌면서 클라이언트의 요청을 Listen!
				socket = serverSocket.accept();
				System.out.println("「" + socket.getInetAddress() + " : " + socket.getPort() + "」 에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket); 
				// 클라이언트로부터 들어온 데이터를 받기 위해 스레드 생성 및 스타트
				thread.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
///////////////////////////////////////////////////////////
//String으로 리턴하자.
	void sendToAll(String msg) { // 메세지가 넘어오면
		Iterator it = clients.keySet().iterator(); // 클라이언트의 정보가 담긴 맵의 키를 이터레이터에
													// 담아서
		while (it.hasNext()) { // 모든 클라이언트에게 넘어온 메세지를 쏴준다.
			try {
				System.out.println("sendtoall"+msg);
				String name = (String)it.next();
				PrintWriter out = (PrintWriter) clients.get(name);
				out.println(msg); // 클라이언트에게 보낸다.
				out.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

//////////////////////////서버리시버 클래스//////////////////////////////////////
	class ServerReceiver extends Thread { // 내부 클래스
		Socket socket;
		BufferedReader in;
		PrintWriter out;

		// 스트림 선언.
		public ServerReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				// 생성자에서 해당 소켓의 input/output 스트림을 열어준다.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		@Override
		public void run() { // 스레드 실행.
			// TODO Auto-generated method stub
			String name = "";
			try {
				name = in.readLine(); 
				
				// 채팅 참가자의 이름을 받아서 모두에게 보낸다.

				clients.put(name, out); // output 스트림을 value에?
				System.out.println("현재 접속 인원은" + clients.size() + "명이다.");
				sendToAll("#" + name + "님이 접속했다.\n");
				sendToAll("현재 접속 인원은" + clients.size() + "명이다.");
				
				while (in != null) {
					String temp = in.readLine();
					sendToAll("["+name+"] "+temp);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				// 여기서 접속 종료 메세지
				sendToAll("#" + name + "님이 접속 종료했다.");
				clients.remove(name);
				System.out.println("「" + socket.getInetAddress() + " : " + socket.getPort() + "」 에서 접속을 종료했다.");
				System.out.println("현재 접속 인원은" + clients.size() + "명이다.");
			}
		}
	}// Receiver Class end
	//////////////////////////////////////////////////////////////////
}





