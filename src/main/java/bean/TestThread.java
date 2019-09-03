package bean;

public class TestThread {

	public static void main(String args[]) {

		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		ThreadDemo thread3 = new ThreadDemo();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class ThreadDemo extends Thread {
	
	public void run() {
		for (int i = 0; i < 20; i++) {

			System.out.println("" + this.getName());
			try {
				sleep(300);

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				return;
			}
		}

		System.out.println(" /end");

	}
}
