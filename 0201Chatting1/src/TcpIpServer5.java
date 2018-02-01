import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread { // Output�� ���� ������ ��ü
	Socket socket; // ����� ���� ������ �����Ѵ�.
	DataOutputStream out; // �����͸� �������� ���� ��Ʈ���� �����Ѵ�.
	String name;

	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream()); // �ƿ�ǲ��Ʈ���� ����
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "] ";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			out.writeUTF(name + sc.nextLine()); 
			// Ű���� �Էµ� ���� outputStream�� �Ἥ ������.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in; // �����͸� �޾ƿ������� inputStream�� ����

	public Receiver(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream()); 
			// inputStream�� ����. 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (in != null) { // �Է��� ���� ������
			try {
				
				System.out.println(in.readUTF()); 
				// ����� outputStream(Sender)���κ��� �޾ƿ�(read) �����͸� ����Ѵ�.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TcpIpServer5 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7779); // ��Ʈ�� �����Ͽ� ���������� �����Ѵ�.
			System.out.println("������ �غ�Ǿ��");

			socket = serverSocket.accept();
			// �������Ͽ��� accept�ϸ� ��û�� ���ϰ� ����� ���ο� Socket�� �Ѱ��ش�.
			
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			// ��ǲ/�ƿ�ǲ ��Ʈ���� �������� ���� ������ ��ü�� �����Ѵ�.

			sender.start();
			receiver.start();
			// in/output�� ���� receiver/sender ������ start

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
