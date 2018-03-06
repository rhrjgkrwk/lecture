package objectEx;
/*    + (public)    -(private)    #(protected)
+name:String              
+k:int
+e:int
+m:int

+setUser(name:String, k:int, e:int, m:int):void
+getTotal():int
+getUser():String
*/

public class ObjectEx2 {
	public static void main(String[] args) {
		User ob = new User();
		ob.setUser("ȫ����", 22, 99, 88);
		System.out.println(ob.getUser());
	}
}


class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m){
		this.name = name;
		this.k = k;
		this.e = e;
		this.m =m;
	}
	
	public int getTotal(){
		return k+e+m;
	}
	public String getUser(){
		return "���� �̸��� "+name+"�̰� ������ "+getTotal()+"�� �Դϴ�."; 
	}
}
