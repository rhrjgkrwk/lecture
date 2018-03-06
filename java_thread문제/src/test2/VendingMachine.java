package test2;

import java.util.Stack;

/* wait()와 notify()를 이용하여 완성
	
	Stack store=new Stack();

    pop()   :  꺼냄 
    push()  :  넣기
*/

public class VendingMachine {
	
	@SuppressWarnings("rawtypes")
	Stack store=new Stack(); 
	
	//For coustomer(소비)
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
	
	//For producer(생산)
	@SuppressWarnings("unchecked")
	public synchronized void putDrink(String drink){
		store.push(drink);
		notify();
	}	
}











