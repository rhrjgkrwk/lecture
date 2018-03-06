package test1;

public class EnglishUpperThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
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
