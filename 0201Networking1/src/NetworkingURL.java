import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkingURL {
	public static void main(String[] args) throws Exception {
		URL obj = new URL(args[0]);
		BufferedReader in = new BufferedReader(new InputStreamReader(obj.openStream()));
		String inputLine;
		while ((inputLine = in.readLine())!=null) {
			System.out.println(inputLine);
			System.out.println("================================");
			System.out.println("protocol = "+obj.getProtocol());
			System.out.println("host = "+obj.getHost());
			System.out.println("filename = "+obj.getFile());
			System.out.println("port = "+obj.getPort());
			System.out.println("ref = "+obj.getRef());
		}
		in.close();
	}
}
	