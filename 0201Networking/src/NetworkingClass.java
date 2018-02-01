import java.net.InetAddress;
import java.util.Arrays;

public class NetworkingClass {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress [] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com"); //이름으로 주소를 얻어온다.
			System.out.println("getHostName() : "+ip.getHostName());
			System.out.println("getHostAddress() : "+ip.getHostAddress());
			System.out.println("toString() : "+ip.toString()); //toString : hostName과 hostAddress가 찍힌다.
			
			byte[] ipAddr = ip.getAddress(); // ip주소를 가져온다. 
			//getAddress에서 음수가 나오는 것은 
			//byte가 -127 ~ 128까지 라서.
			//음수인 것에 256을 더하면 
			System.out.println("getAddress() : "+Arrays.toString(ipAddr)); 
			//JSON형태 출력 (JavaScript Object Notation)
			
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
			ipArr = InetAddress.getAllByName("www.naver.com"); //return값이 InetAddress[]
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] : "+ipArr[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
