package test1;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	 String name;
	int num;
	double score;
	public Student() {
	}
	public Student(String name, int num, double score) {
		this.name = name;
		this.num = num;
		this.score = score;
	}
	@Override
	public String toString() {
		return name+" "+num+" "+score;
	}
	//implements Comparable<Student> 작성시.
	/*@Override
	public int compareTo(Student s) {
		return Integer.compare(this.num, s.num);
	}*/
	/*<Integer.compare>
	x-y값을 리턴.
	x==y 면 0 리턴
	x<y면 음수 리턴
	x>y면 양수 리턴*/
	
/*	오름차순 정렬시 
	this.num, s.num 순으로
	내림차순 정렬시
	s.num, this.num 순으로*/
}
public class StudentMain {
	public static void main(String[] args) {
		Student[] s = new Student[5];
		s[0] = new Student("Dave",20170305,4.5);
		s[1] = new Student("ann",20180922,3.5);
		s[2] = new Student("emma",20150303,7.5);
		s[3] = new Student("zac",20160502,7.5);
		s[4] = new Student("cara",20150202,8.5);
		Arrays.sort(s, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) { //학번 오름차순
				if (s1.score==s2.score) { //학점이 같으면 학번 오름차순
					return Integer.compare(s1.num, s2.num);
				}
				return Double.compare(s1.score, s2.score);
			}
		
		});
		for (Student student : s) {
			System.out.println(student);
		}
	}
}
