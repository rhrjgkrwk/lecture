package test2;

import java.util.Stack;

/* wait()�� notify()�� �̿��Ͽ� �ϼ�
	
	Stack store=new Stack();

    pop()   :  ���� 
    push()  :  �ֱ�
*/

public class VendingMachine {
	
	@SuppressWarnings("rawtypes")
	Stack store=new Stack(); 
	
	//For coustomer(�Һ�)
	public synchronized String getDrink(){
		while(store.isEmpty())
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		return store.pop().toString();
	}
	
	//For producer(����)
	@SuppressWarnings("unchecked")
	public synchronized void putDrink(String drink){
		store.push(drink);
		notify();
	}	
}











