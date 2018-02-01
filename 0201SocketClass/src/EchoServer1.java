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
			ss = new ServerSocket(9962); //port�� �ִ´�.
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {//���� ������ ���鼭 listen
			Socket s;
			try {
				s = ss. accept();
				String remoteHost = s.getInetAddress().getHostAddress();
				System.out.println(remoteHost+" ==> Server IP");
				/*
				InputStream/OutputStream�� �����͸� �ְ�޴� ���.
				*/
				InputStream in = s.getInputStream(); //������
				OutputStream out = s.getOutputStream(); //server ==> client
				
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out)); 
				bw.write((remoteHost)+"������ ������ ��û�߱���");
				bw.newLine();
				bw.flush();
				
				String line;
				while (true) {
					line = br.readLine(); //�ް�
					if (line==null) {
						break;
					}
					System.out.println(line);//������ ����Ʈ
					bw.write(line); //���� �� �ٽ� �״�� �����ش�.
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
