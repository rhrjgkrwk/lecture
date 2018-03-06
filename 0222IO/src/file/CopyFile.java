package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * args
Copy File src/file/data3.txt ==> src/file/data100.txt
*/
public class CopyFile {
	public static void main(String[] args) {
		String file1 = args[0];
		String file2 = args[1];
		try {
			File file=new File(file1);
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream in=new BufferedInputStream(fis);
			byte[] buf = new byte[(int)file.length()];
			in.read(buf,0,buf.length);
			FileWriter fw = new FileWriter(file2);
			fw.write(new String(buf));
			System.out.println("¿Ï·á");
			
			fw.close();
			in.close();
			fis.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}		
	}
}
