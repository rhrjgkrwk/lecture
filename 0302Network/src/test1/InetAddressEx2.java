package test1;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx2 {
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		Scanner sc = new Scanner(System.in);
		String host = null;
		host = sc.nextLine();
		InetAddress[] addr = InetAddress.getAllByName(host);
		System.out.println(host+addr.length+"개의 아이피가 있ㄸ.");
		for (InetAddress d : addr) {
			System.out.println(d.getHostAddress());
		}
	}
}
