import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) {
		
		try {
			String host = args[0];
			int port = Integer.parseInt(args[1]);
			Socket s;
			s = new Socket(host, port);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//�̰� �׳� Ű���� �Է�. scanner
			
			String txMsg = "";
			String recMsg = "";
			
			System.out.println(br.readLine());
			while (true) {
				System.out.print("Data Input : ");
				txMsg = in.readLine(); //Ű���� �Է�. Scanner
				if (txMsg.length()==0) {
					break;
				}
				bw.write(txMsg, 0, txMsg.length());
				bw.newLine(); //newLine �Է�
				bw.flush(); //���� ������ �ݴ������� ��.
				
				recMsg = br.readLine();
				System.out.println("Echoed Data : "+recMsg);
			}
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
