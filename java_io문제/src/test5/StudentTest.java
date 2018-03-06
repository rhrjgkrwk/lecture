package test5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//���� �ڵ带 �����Ͽ� ���α׷��� �ϼ��Ͻÿ�
class Student {
	// private name,kor,eng,math ����, ������, set/get
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
			StringTokenizer st = new StringTokenizer(str, "-����:/����/����");// StringTokenizer�� �и��Ͽ� list��ü�� �߰��ϱ�
			while (st.hasMoreTokens()) {
				Student s = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
				list.add(s);
				System.out.println(s);
			}
		}
		
		// -------------------------------------------------------------------------
		// list �� ��ü�� ���� ���� ����/��ձ��ϱ�
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
		// backup.dat����
		// ���л��� ���Ϸ� ����ϱ�
		// �� ���� ����/��շ� ����ϱ�
		pw.println("========================");
		pw.println("���л��� =" + list.size() + "��");
		pw.println("���� ���� = " + sumOfKor + " ���� ���= " + avgOfKor);
		pw.println("���� ���� = " + sumOfEng + " ���� ���= " + avgOfEng);
		pw.println("���� ���� = " + sumOfMath + " ���� ���= " + avgOfMath);
		pw.println("========================\n");

		pw.close();
		br.close();
		System.out.println("backup.txt ������ �����Ǿ����ϴ�");
	}
}
