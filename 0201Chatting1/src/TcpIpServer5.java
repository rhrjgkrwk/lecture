import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread { // Output을 위한 스레드 객체
	Socket socket; // 통신을 위한 소켓을 선언한다.
	DataOutputStream out; // 데이터를 내보내기 위한 스트림을 선언한다.
	String name;

	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream()); // 아웃풋스트림을 생성
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
			// 키보드 입력된 것을 outputStream에 써서 보낸다.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in; // 데이터를 받아오기위해 inputStream을 선언

	public Receiver(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream()); 
			// inputStream을 생성. 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (in != null) { // 입력이 없을 때까지
			try {
				
				System.out.println(in.readUTF()); 
				// 상대의 outputStream(Sender)으로부터 받아온(read) 데이터를 출력한다.
				
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
			serverSocket = new ServerSocket(7779); // 포트를 지정하여 서버소켓을 생성한다.
			System.out.println("서버가 준비되었어여");

			socket = serverSocket.accept();
			// 서버소켓에서 accept하면 요청한 소켓과 연결된 새로운 Socket을 넘겨준다.
			
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			// 인풋/아웃풋 스트림을 열기위해 각각 스레드 객체를 생성한다.

			sender.start();
			receiver.start();
			// in/output을 위한 receiver/sender 스레드 start

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
