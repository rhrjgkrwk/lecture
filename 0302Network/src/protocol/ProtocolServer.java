package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  100:���̵�                         ==>����
 *  200:���̵�                         ==>����
 *  300:���̵�:�޼���                  ==>��ȭ�濡 ������ ��� ����鿡�� �޼��� ����
 *  400:���̵�1:���̵�2:�޼���         ==>���̵�1�� ���̵�2���� �ӼӸ�
 */
public class ProtocolServer {
	ServerSocket ss=null;
	Socket sock=null;
	BufferedReader br=null;
	BufferedWriter bw=null;
	
	public ProtocolServer() throws IOException{
		ss=new ServerSocket(7000);
		System.out.println("���� �����....");
		sock=ss.accept();           //����
		
		br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
		bw=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		
		while(true)
		{
			try{
				String buf=br.readLine();
				String[] words=buf.split(":");  //�о�� ���ڿ���  ������(:) �� �и�
				
				if(words[0].equals(Protocol.ENTER)){    //����
					enter(words);
				}else if(words[0].equals(Protocol.EXIT)){  //����
					exit(words);
				}else if(words[0].equals(Protocol.SEND_MESSAGE)){  //�޼��� ����
					sendMessage(words);
				}else if(words[0].equals(Protocol.SECRET_MESSAGE)){  //�ӼӸ�
					secretMessage(words);
				}else{
					bw.write("�߸��� ��û�Դϴ�\n");
					bw.flush();
				}
			}catch(IOException e){
				System.exit(0);
			}
		}		
	}
	
	private void secretMessage(String[] words) {
		//400:���̵�1:���̵�2:�޼���
		System.out.println("[" + words[0] + "��" + words[2] + "�� �ӼӸ��� ����]");
		System.out.println("[" + words[1] + "]" + words[3] + "\n");
	}

	private void sendMessage(String[] words) {
		//300:���̵�:�޼���
		System.out.println("[" + words[1] + "]" + words[2] + "\n");
	}

	private void exit(String[] words) {
		//200:���̵�
		System.out.println("[" + words[1] + "]���� �����ϼ̽��ϴ�\n");
	}

	private void enter(String[] words) {
		//100:���̵�
		System.out.println("[" + words[1] + "]���� �����ϼ̽��ϴ�\n");
	}

	public static void main(String[] args) throws IOException {
		new ProtocolServer();
	}
}













