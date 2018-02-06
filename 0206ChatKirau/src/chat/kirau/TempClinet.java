package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
	public static void main(String[] args) {
		if (args.length!=3) {
			System.out.println("USAGE : java MultiChatClient IP_Address Port NickName");
																			// 		IP주소	포트	대화명
			System.exit(0);
		}
		String serverIP = args[0];
		String name = args[2];
		
		try { // 서버에 접속해보자.
			Socket socket = new Socket(serverIP, Integer.parseInt(args[1]));
			System.out.println("서버에 연결되었습니다.");
			
			Thread sender = new Thread(new ClientSender(socket, name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}//main end
	
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		public ClientSender(Socket socket, String name) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			
			try {
				this.name = name;
				out =new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name); //대화명을 먼저 넘겨주자(접속자 리스트 관리를 위해서)
				}
				while (out!=null) { //메세지 보내기.
					out.writeUTF("["+name+"] "+sc.nextLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		public ClientReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
	}
}
