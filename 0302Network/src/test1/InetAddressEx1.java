package test1;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		InetAddress a1 = InetAddress.getByName("www.naver.com");
		InetAddress a2 = InetAddress.getByName("localhost");
		
		URL url = new URL("http://127.0.0.1:9000/apex");
		
		System.out.println(url.getProtocol()+" "+url.getPort()+" "+url.getPath());
		
		System.out.println(a1.getHostAddress());
		System.out.println(a1.getHostName()); 
		System.out.println(a2.getHostAddress());
		System.out.println(a2.getHostName());
	}
}
