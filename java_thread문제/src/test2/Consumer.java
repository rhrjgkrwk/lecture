package test2;

public class Consumer extends Thread{
	private VendingMachine vm;

	public Consumer() {
	}
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+vm.getDrink()+" ²¨³»¸Ô¾ú´Ù.\n");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
