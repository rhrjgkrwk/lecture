package test2;

public class Producer extends Thread{
	private VendingMachine vm;

	public Producer() {
		// TODO Auto-generated constructor stub
	}
	
	public Producer(VendingMachine vm) {
		this.vm = vm;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			vm.putDrink("����� No."+i);
			System.out.println(Thread.currentThread().getName()+" : ����� No."+i+" ���Ǳ⿡ �־���.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
