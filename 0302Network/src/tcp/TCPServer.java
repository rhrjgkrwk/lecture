package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	ServerSocket ss = null;
	Socket s = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	public TCPServer() throws IOException {
		// TODO Auto-generated constructor stub
		ss = new ServerSocket(7000);
		System.out.println("접속 대기중");
		while(true){
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(System.out);
			pw.println(s.getInetAddress()+" : "+br.readLine());
			pw.close();
			br.close();
			s.close();
		}
	}
	public static void main(String[] args) {
		try {
			new TCPServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



/*
 * 콘솔에서 패키지 컴파일 방법
 * javac ~~.java
 * 
 * 
*/