package abstractEx;
/*
class AA{
	public void view1(){}//--1
	public void view2(){}//--2
}

class BB extends AA{
	
	@Override
	public void view1(){}
}


public class AbstractEx1 {

	public static void main(String[] args) {
		AA ob = new AA(); //객체생성,1번호출
		ob.view1();
		
		AA ob2 = new BB(); //3,2번 호출
		ob2.view1();
		ob2.view2();
	}

}
*/

// ↑ 위를 추상(미완성) 클래스로!--------------------------
/*abstract class AA{
	abstract public void view1();//--1
	public void view2(){}//--2
}

class BB extends AA{
	@Override
	public void view1(){} //--3 강제재정의
}


public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); //객체생성불가능. 
		//ob.view1(); 따라서 호출 불가능
		
		AA ob2 = new BB(); //3,2번 호출
		ob2.view1();
		ob2.view2();
	}

}*/

//↑ 위를 추상(완성?) 클래스로!   뭐한지 모르게따--------------------------
abstract class AA{
	abstract public void view1();//--1
	public void view2(){}//--2
}

class BB extends AA{
	@Override
	public void view1(){} //--3 강제재정의
}


public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); //객체생성불가능. 
		
		
		AA ob2 = new BB(); //3,2번 호출
		ob2.view1();
		ob2.view2();
	}

}

