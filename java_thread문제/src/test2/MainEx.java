package test2;

public class MainEx {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();

		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);

		Thread t1 = new Thread(p, "������");
		Thread t2 = new Thread(c, "�Һ���");

		t1.start();
		t2.start();
	}
}
