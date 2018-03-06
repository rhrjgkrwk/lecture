package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


public class MultiChatServer {
	HashMap clients;

	public MultiChatServer() {
		// TODO Auto-generated constructor stub
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// ��ũ�γ������ ���� �ѹ��� ��°�� ����ȭ��Ű�� ���̴�.
		// Ŭ���̾�Ʈ�� ���� ���ö� ���� �ְ� ����.
	}

	public static void main(String[] args) {
		new MultiChatServer().start(Integer.parseInt(args[0]));
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

	void sendToAll(String msg) { // �޼����� �Ѿ����
		Iterator it = clients.keySet().iterator(); // Ŭ���̾�Ʈ�� ������ ��� ���� Ű�� ���ͷ����Ϳ�
													// ��Ƽ�
		while (it.hasNext()) { // ��� Ŭ���̾�Ʈ���� �Ѿ�� �޼����� ���ش�.
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg); // Ŭ���̾�Ʈ���� ������.
				System.out.println(msg);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

//////////////////////////�������ù� Ŭ����//////////////////////////////////////
	class ServerReceiver extends Thread { // ���� Ŭ����
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		// ��Ʈ�� ����.
		public ServerReceiver(Socket socket) {
			// TODO Auto-generated constructor stub
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
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
				name = in.readUTF();
				sendToAll("#" + name + "���� �����ߴ�.");
				// ä�� �������� �̸��� �޾Ƽ� ��ο��� ������.

				clients.put(name, out); // output ��Ʈ���� value��?
				System.out.println("���� ���� �ο���" + clients.size() + "���̴�.");

				while (in != null) {
					sendToAll(in.readUTF());
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





