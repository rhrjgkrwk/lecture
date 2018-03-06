package test5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//다음 코드를 수정하여 프로그램을 완성하시오
class Student {
	// private name,kor,eng,math 변수, 생성자, set/get
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
		super();
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+kor+" "+eng+" "+math;
	}
}

public class StudentTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test5/student.dat"));
		PrintWriter pw = new PrintWriter(new FileWriter("src/test5/backup.dat"));
		List<Student> list = new ArrayList<Student>();
		String str = null;
		while ((str=br.readLine())!=null) { // End of File
			StringTokenizer st = new StringTokenizer(str, "-국어:/영어/수학");// StringTokenizer로 분리하여 list객체에 추가하기
			while (st.hasMoreTokens()) {
				Student s = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
				list.add(s);
				System.out.println(s);
			}
		}
		
		// -------------------------------------------------------------------------
		// list 각 객체의 국어 점수 총합/평균구하기
		int sumOfKor = 0, sumOfEng = 0, sumOfMath = 0;
		int avgOfKor = 0, avgOfEng = 0, avgOfMath = 0;
		for (int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			sumOfKor += st.getKor();
			sumOfEng += st.getEng();
			sumOfMath += st.getMath();
		}
		avgOfKor = sumOfKor / list.size();
		avgOfEng = sumOfEng / list.size();
		avgOfMath = sumOfMath / list.size();

		// -------------------------------------------------------------------------
		// backup.dat파일
		// 총학생수 파일로 출력하기
		// 각 과목별 총합/평균로 출력하기
		pw.println("========================");
		pw.println("총학생수 =" + list.size() + "명");
		pw.println("국어 총합 = " + sumOfKor + " 국어 평균= " + avgOfKor);
		pw.println("영어 총합 = " + sumOfEng + " 영어 평균= " + avgOfEng);
		pw.println("수학 총합 = " + sumOfMath + " 수학 평균= " + avgOfMath);
		pw.println("========================\n");

		pw.close();
		br.close();
		System.out.println("backup.txt 파일이 생성되었습니다");
	}
}
