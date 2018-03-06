package ioex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream file = new FileOutputStream("src/ioex/test.txt");
			DataOutputStream out = new DataOutputStream(file);
			out.writeUTF("¸Þ·Õ");
			out.writeUTF("¸Þ·Î·Õ");
			out.writeUTF("¸Þ·Î·Î·Õ");
			out.writeInt(1234);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream file = new FileInputStream("src/ioex/test.txt");
			DataInputStream in = new DataInputStream(file);
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
