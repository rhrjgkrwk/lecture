package test1;

public class EnglishLowerThread extends Thread{

	@Override
	public void run() {
		char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (char c : arr) {
			try {
				System.out.print(c+" ");
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println();
	}
	
}
