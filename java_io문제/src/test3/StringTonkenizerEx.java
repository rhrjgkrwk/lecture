package test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTonkenizerEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader(new File("src/test3/emp.txt")));
		String str = null;
		while ((str = br.readLine())!=null) {
			StringTokenizer token=new StringTokenizer(str,"\t");
			while (token.hasMoreTokens()) {
				System.out.println("이름  : "+token.nextToken()+"\t부서  : "+token.nextToken()+"\t급여  : "+token.nextToken());
			}
		}
		br.close();
	}
}
/*
[문제3] 데이타를 입력받아 파일에 기록하시오

1) 값을 입력받아 파일로 출력하는 프로그램
파일명 : EmpOutputTest.java
처리조건 : 데이타들 사이에 \t를 추가하여 저장하시오
           ex) name+"\t"+dept+"\t"+salary+"\n"


입력을 종료하시려면 ctrl+z를 하시오
이름을 입력하시오 : 강호동
부서를 입력하시오 : 개발부
급여를 입력하시오 : 1500000
계속 입력하려면 Enter키를 누르시오

이름을 입력하시오 : 이순신
부서를 입력하시오 : 영업부
급여를 입력하시오 : 2500000
계속 입력하려면 Enter키를 누르시오
ctrl+z

emp.txt파일이 저장 되었습니다
--------------------------------------------------------
emp.txt파일
강호동    개발부    1500000
이순신    영업부    2500000

==========================================
2) emp.txt파일을 읽어서 출력하시오
파일명 : EmpInputTest.java
처리조건 : StringTokenizer을 이용해서 데이타를 파싱하여 
            아래와 같이출력하시오

[출력결과]
이름 : 강호동   부서 : 개발부   급여 150000
이름 : 이순신   부서 : 영업부   급여 250000
*/