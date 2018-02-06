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
		// ��ũ�γ������ ���� �ѹ��� ��°�� ����ȭ��Ű�� ���̴�.
		// Ŭ���̾�Ʈ�� ���� ���ö� ���� �ְ� ����.
	}

	public static void main(String[] args) {
		new ChatKirauServer().start(7897); //�ӽ���Ʈ 7897
	}
	
//////////////������ ����(���� ���� ����)//////////////
	
	public void start(int port) { // ���������� �����.
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(port); // Ŭ���̾�Ʈ�� �����û�� ����.
			System.out.println("������ ���۵Ǿ����ϴ�.");
			while (true) {// ���� ������ ���鼭 Ŭ���̾�Ʈ�� ��û�� Listen!
				socket = serverSocket.accept();
				System.out.println("��" + socket.getInetAddress() + " : " + socket.getPort() + "�� ���� �����Ͽ����ϴ�.");
				ServerReceiver thread = new ServerReceiver(socket); 
				// Ŭ���̾�Ʈ�κ��� ���� �����͸� �ޱ� ���� ������ ���� �� ��ŸƮ
				thread.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
///////////////////////////////////////////////////////////
//String���� ��������.
	void sendToAll(String msg) { // �޼����� �Ѿ����
		Iterator it = clients.keySet().iterator(); // Ŭ���̾�Ʈ�� ������ ��� ���� Ű�� ���ͷ����Ϳ�
													// ��Ƽ�
		while (it.hasNext()) { // ��� Ŭ���̾�Ʈ���� �Ѿ�� �޼����� ���ش�.
			try {
				System.out.println("sendtoall"+msg);
				String name = (String)it.next();
				PrintWriter out = (PrintWriter) clients.get(name);
				out.println(msg); // Ŭ���̾�Ʈ���� ������.
				out.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

//////////////////////////�������ù� Ŭ����//////////////////////////////////////
	class ServerReceiver extends Thread { // ���� Ŭ����
		Socket socket;
		BufferedReader in;
		PrintWriter out;

		// ��Ʈ�� ����.
		public ServerReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream());
				// �����ڿ��� �ش� ������ input/output ��Ʈ���� �����ش�.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		@Override
		public void run() { // ������ ����.
			// TODO Auto-generated method stub
			String name = "";
			try {
				name = in.readLine(); 
				
				// ä�� �������� �̸��� �޾Ƽ� ��ο��� ������.

				clients.put(name, out); // output ��Ʈ���� value��?
				System.out.println("���� ���� �ο���" + clients.size() + "���̴�.");
				sendToAll("#" + name + "���� �����ߴ�.\n");
				sendToAll("���� ���� �ο���" + clients.size() + "���̴�.");
				
				while (in != null) {
					String temp = in.readLine();
					sendToAll("["+name+"] "+temp);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				// ���⼭ ���� ���� �޼���
				sendToAll("#" + name + "���� ���� �����ߴ�.");
				clients.remove(name);
				System.out.println("��" + socket.getInetAddress() + " : " + socket.getPort() + "�� ���� ������ �����ߴ�.");
				System.out.println("���� ���� �ο���" + clients.size() + "���̴�.");
			}
		}
	}// Receiver Class end
	//////////////////////////////////////////////////////////////////
}





