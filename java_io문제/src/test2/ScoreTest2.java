package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreTest2 {
	public static void main(String[] args) throws IOException {
		String from = "src/test2/source.txt";
		String to = "src/test2/desc.txt";
		File file = new File(from);
		BufferedReader br = new BufferedReader(new FileReader(new File(from)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(to))));
		while (true) {
			String name = br.readLine();
			if (name==null) {
				break;
			}
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum+=Integer.parseInt(br.readLine());
			}
			pw.println((String.format("이름 : %s 총점 : %d 평균 : %.2f",name, sum, sum/3.0)));
		}
		br.close();
		pw.close();
	}
}

/*
[문제2]

1. source.txt파일을 읽어서 결과물을 desc.txt로 출력하시오
2. 파일명 : ScoreTest2.java

test2/source.txt
이순신
90
80
75
강호동
76
45
88

test2/desc.txt
이름 : 강호동  총점 : 221  평균 : 73.7
이름 : 이순신  총점 : 216  평균 : 72.0
이름 : 이만기  총점 : 253  평균 : 84.3

*/




