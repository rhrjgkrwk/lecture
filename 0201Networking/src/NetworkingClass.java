import java.net.InetAddress;
import java.util.Arrays;

public class NetworkingClass {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress [] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com"); //�̸����� �ּҸ� ���´�.
			System.out.println("getHostName() : "+ip.getHostName());
			System.out.println("getHostAddress() : "+ip.getHostAddress());
			System.out.println("toString() : "+ip.toString()); //toString : hostName�� hostAddress�� ������.
			
			byte[] ipAddr = ip.getAddress(); // ip�ּҸ� �����´�. 
			//getAddress���� ������ ������ ���� 
			//byte�� -127 ~ 128���� ��.
			//������ �Ϳ� 256�� ���ϸ� 
			System.out.println("getAddress() : "+Arrays.toString(ipAddr)); 
			//JSON���� ��� (JavaScript Object Notation)
			
			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i]<0)? ipAddr[i]+256:ipAddr[i];
				result += ".";
			}
			System.out.println("getAddress()+256 : "+result);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : "+ip.getHostName());
			System.out.println("getHostAddress() : "+ip.getHostAddress());
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			ipArr = InetAddress.getAllByName("www.naver.com"); //return���� InetAddress[]
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] : "+ipArr[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
