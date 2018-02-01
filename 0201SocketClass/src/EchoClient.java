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
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//이건 그냥 키보드 입력. scanner
			
			String txMsg = "";
			String recMsg = "";
			
			System.out.println(br.readLine());
			while (true) {
				System.out.print("Data Input : ");
				txMsg = in.readLine(); //키보드 입력. Scanner
				if (txMsg.length()==0) {
					break;
				}
				bw.write(txMsg, 0, txMsg.length());
				bw.newLine(); //newLine 입력
				bw.flush(); //물을 내리면 반대쪽으로 감.
				
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
