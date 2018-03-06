package test01;

public class LambdaEx3 {
	public static void main(String[] args) {
		// 익명함수
		new Thread(() -> {
			System.out.println("Hello Thread");
		}).start();
		// //익명함수
		// new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// System.out.println("Hello Thread");
		// }
		// });
	}
}

// class MyThread implements Runnable{
//
// @Override
// public void run() {
// // TODO Auto-generated method stub
// System.out.println("Hello Thread");
// }
//
// }
//
// public class LambdaEx3 {
// public static void main(String[] args) {
// MyThread mt = new MyThread();
// Thread t = new Thread(mt);
// new Thread(new MyThread()).start();
// }
// }
