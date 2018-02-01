import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient5 {
	public static void main(String[] args) {
		String serverIp = "70.12.109.101"; 
		//local address : 내가 내 주소를 이야기할 때는 127.0.0.1이라구 쓴다.
		Socket socket;
		try {
			socket = new Socket(serverIp, 7779);//서버의 주소와 포트를 가진 클라이언트 소켓을 생성
			
			System.out.println("서버에 연결되었습니다."); //연결에 오류가 없으면 출력된다.
			
			//소켓 통신을 위한 input / output Stream를 가진 스레드를 생성
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			//스레드 시작
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
