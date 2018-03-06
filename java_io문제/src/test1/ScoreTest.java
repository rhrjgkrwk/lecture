package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test1/score.txt")));
		while (true) {
			String name = br.readLine();
			if (name==null) {
				break;
			}
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum+=Integer.parseInt(br.readLine());
			}
			System.out.printf("ÀÌ¸§ : %s ÃÑÁ¡ : %d Æò±Õ : %.2f\n",name, sum, sum/3.0);
		}
		br.close();
	}
}
