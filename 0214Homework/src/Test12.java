class ScoreTable{
	private String name;
	private int sol; //맞은 수
	private static int s=20; //배점
	private int score; // 맞은 수 *  배점
	public ScoreTable() {
	}
	public ScoreTable(String name, int sol) {
		this.name = name;
		this.sol = sol;
		calcScore();
	}
	public void calcScore(){
		score = s*sol;
	}
	public void display(){
		System.out.println(name+"  \t"+score);
	}
}
public class Test12 {
	public static void main(String[] args) {
		 ScoreTable  s1 = new ScoreTable("민들래",5);
         ScoreTable  s2 = new ScoreTable("진달래",3);
         ScoreTable  s3 = new ScoreTable("개나리",0);
         //나머지를 완성하시오
         System.out.println("이름           점수\n-------------------------");
         s1.display();
         s2.display();
         s3.display();
         
	}
}


/*
[문제12]
(1)클래스명:ScoreTable
  - name:String    ==> 이름
  - sol:int            ==> 맞은수
  - s: static int     ==> 배점(20)
  - score:int         ==> 점수=맞은수*배점
  +ScoreTable()
  +ScoreTable(name:String,sol:int)  
  +calcScore():void          ==>계산
  +display():void             ==> 출력  

(3) main()함수에서 
    public static void main(String[] args){
           ScoreTable  s1 = new ScoreTable("민들래",5);
           ScoreTable  s2 = new ScoreTable("진달래",3);
           ScoreTable  s2 = new ScoreTable("개나리",0);
           //나머지를 완성하시오
    }
[출력화면]
   이름      점수      
  ---------------------
   민들래    100
   진달래     60
   개나리      0
*/