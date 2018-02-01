import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient5 {
	public static void main(String[] args) {
		String serverIp = "70.12.109.101"; 
		//local address : ���� �� �ּҸ� �̾߱��� ���� 127.0.0.1�̶� ����.
		Socket socket;
		try {
			socket = new Socket(serverIp, 7779);//������ �ּҿ� ��Ʈ�� ���� Ŭ���̾�Ʈ ������ ����
			
			System.out.println("������ ����Ǿ����ϴ�."); //���ῡ ������ ������ ��µȴ�.
			
			//���� ����� ���� input / output Stream�� ���� �����带 ����
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			//������ ����
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
