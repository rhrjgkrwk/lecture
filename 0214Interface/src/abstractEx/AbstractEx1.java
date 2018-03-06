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
		AA ob = new AA(); //��ü����,1��ȣ��
		ob.view1();
		
		AA ob2 = new BB(); //3,2�� ȣ��
		ob2.view1();
		ob2.view2();
	}

}
*/

// �� ���� �߻�(�̿ϼ�) Ŭ������!--------------------------
/*abstract class AA{
	abstract public void view1();//--1
	public void view2(){}//--2
}

class BB extends AA{
	@Override
	public void view1(){} //--3 ����������
}


public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); //��ü�����Ұ���. 
		//ob.view1(); ���� ȣ�� �Ұ���
		
		AA ob2 = new BB(); //3,2�� ȣ��
		ob2.view1();
		ob2.view2();
	}

}*/

//�� ���� �߻�(�ϼ�?) Ŭ������!   ������ �𸣰Ե�--------------------------
abstract class AA{
	abstract public void view1();//--1
	public void view2(){}//--2
}

class BB extends AA{
	@Override
	public void view1(){} //--3 ����������
}


public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); //��ü�����Ұ���. 
		
		
		AA ob2 = new BB(); //3,2�� ȣ��
		ob2.view1();
		ob2.view2();
	}

}

