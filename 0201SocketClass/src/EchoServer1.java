import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(9962); //port를 넣는다.
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {//무한 루프를 돌면서 listen
			Socket s;
			try {
				s = ss. accept();
				String remoteHost = s.getInetAddress().getHostAddress();
				System.out.println(remoteHost+" ==> Server IP");
				/*
				InputStream/OutputStream은 데이터를 주고받는 통로.
				*/
				InputStream in = s.getInputStream(); //보내기
				OutputStream out = s.getOutputStream(); //server ==> client
				
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out)); 
				bw.write((remoteHost)+"서버에 연결을 요청했군여");
				bw.newLine();
				bw.flush();
				
				String line;
				while (true) {
					line = br.readLine(); //받고
					if (line==null) {
						break;
					}
					System.out.println(line);//서버에 프린트
					bw.write(line); //받은 걸 다시 그대로 돌려준다.
					bw.newLine();//server ==> client
					bw.flush();
				}
			s.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}	
		}
	}
}
