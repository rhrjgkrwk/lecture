package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	Socket sock = null;
	BufferedReader br = null;
	BufferedReader keyboard=null;
	BufferedWriter bw = null;
	
	public ProtocolClient(){
		try{
			sock=new Socket("127.0.0.1", 7000);
			
		}catch(UnknownHostException e){
			System.out.println("������ ã���� �����ϴ�");
			System.exit(0);
		}catch(IOException e){
			System.out.println("������ ���� �Ҽ� �����ϴ�");
			System.exit(0);
		}
		//-------------------------------------------------------------
		try{
			//keyboard�� ����� ��Ʈ��
			keyboard=new BufferedReader(new InputStreamReader(System.in));
			
			//sock�� ���� stream����
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true)
			{
				//�޼����� �޾Ƽ� ������ �����ϱ�-----------------------------
				System.out.println("ex)100:���̵�(����),  200:���̵�(����),  300:���̵�:�޼���(��ȭ),  400:���̵�1:���̵�2:�޼���(�ӼӸ�)");
				System.out.print("�޼����� �Է��Ͻÿ� : ");
				
				String msg=keyboard.readLine();
				bw.write(msg + "\n");
				bw.flush();
			}
		}catch(IOException e){
			System.out.println("������ ������ ������");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}







