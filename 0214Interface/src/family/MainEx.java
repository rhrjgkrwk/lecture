package family;

class  MainEx
{
	public static void main(String[] args) 
	{
		/*Father ft=new Father("홍길동");
		Mother mt=new Mother("김순희");
		Son so=new Son("홍돌이");
		
		System.out.println(ft);                //or   ft.toString()
		System.out.println(mt);
		System.out.println(so);*/
		
		/*Family []f = new Family[]{
			new Father("홍딜공"), new Mother("박순희"), new Son("홍돌자")
		};
		for (Family fam : f) {
			System.out.println(fam);
		}*/
		
		Family f = new Family("이창희");
		System.out.println(f);
	}
}
/*  이름 : 홍길동                  <--- Family의 toString()에서 작성
 *  아빠는 나가서 일을 한다    <--  Job인터페이스를 상속받아서  
 *                                           Father의  work()에서 작성 
 *                                       
 *  이름 : 김순희
 *  엄마는 집안일을 한다
 * 
 *  이름 : 홍돌이
 *  아들은 공부를 한다 
 */