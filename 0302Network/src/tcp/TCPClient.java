package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static final int PORT = 7000;
	Socket s = null;
	String server_ip;
	BufferedWriter bw;
	public TCPClient(String server_ip) throws UnknownHostException, IOException {
		this.server_ip = server_ip;
		s = new Socket(server_ip, PORT);
		bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String str = new Scanner(System.in).nextLine();
		while (str!=null) {
			bw.write(str);
			bw.flush();
			
		}
		
		
		bw.close();
		s.close();
	}
	public static void main(String[] args) {
		try {
			new TCPClient("127.0.0.1");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
