package java33;

public class Java18 {
	public static void main(String[] args) throws InterruptedException {
		th1 t1 = new th1();
		th2 t2 = new th2();
		th3 t3 = new th3();
		t3.setPriority(10);
		
		t1.setPriority(1);
		t1.start();
		t3.join();
		new Thread(t2).start();
		t3.start();
	}
}

class th1 extends Thread {
	public void run() {
		System.out.println("th1 start");
		for (int x = 0; x < 101; x++) {
			System.out.print(x + " ");
		}
		System.out.println("th1 end");
	}

}

class th2 implements Runnable {
	public void run() {
		System.out.println("th2 start");
		for (int x = 101; x < 201; x++) {
			System.out.print(x + " ");
		}
		System.out.println("th2 end");
	}
}

class th3 extends Thread {
	public void run() {
		System.out.println("th3 start");
		for (int x = 201; x < 301; x++) {
			System.out.print(x + " ");
		}
		System.out.println("th3 end");
	}
}