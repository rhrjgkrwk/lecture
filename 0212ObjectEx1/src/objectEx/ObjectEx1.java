package objectEx;

		/*  -(private) , +(public) , #(protected)
		 *  
		 *  클래스명 : Person
		 *  +name:String
		 *  +age:int
		 *  +score:float
		 *  
		 *  +setPerson(na:String, a:int, s:float) : void
		 *  +viewPerson():void 
		 */

class Person{
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String na, int a, float s){
		this.name = na;
		this.age = a;
		this.score = s;
		
	}
	public void viewPerson(){
		System.out.println(name+" "+age+" "+score);
	}
}

public class ObjectEx1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setPerson("ch", 123, 55.2f);
		p.viewPerson();
		System.out.println(p.hashCode());
		Person p1 = new Person();
		p1.setPerson("ch", 123, 55.2f);
		p1.viewPerson();
		System.out.println(p1.hashCode());
	}
}
