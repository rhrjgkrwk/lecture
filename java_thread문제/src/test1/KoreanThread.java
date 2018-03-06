package test1;

public class KoreanThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		char[] arr={'ぁ','い','ぇ','ぉ','け','げ','さ','し','じ','ず','せ','ぜ','そ','ぞ'};
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
