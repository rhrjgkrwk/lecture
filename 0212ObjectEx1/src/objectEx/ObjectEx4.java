package objectEx;

public class ObjectEx4 {
	public static void main(String[] args) {
		Employee  em=new Employee();
		//setter로 값을 대입하고 toString()로 출력하시오
		em.setName("이장희");
		em.setDept("개밥루");
		em.setPay(50000000);
		em.setScore(99.0);
		System.out.println(em);
		
		em.setEmployee("진달래","경리부",1200000,75.34);
		//getter로 출력하시오
		System.out.println("이름 : "+em.getName());
		System.out.println("부서 : "+em.getDept());
		System.out.println("월급 : "+em.getPay()+"원");
		System.out.println("점수 : "+em.getScore()+"점");
	}
}
/*
이름은 이순신이고 개발부에 근무하며 급여는 1500000원 입사성적은 85.75입니다

사원이름 : 진달래
근무부서 : 경리부
받는급여 : 1200000원
입사점수 : 75.34점
*/




