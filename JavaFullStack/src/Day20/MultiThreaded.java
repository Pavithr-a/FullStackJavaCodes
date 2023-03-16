package Day20;

class Thread1 implements Runnable{
	Thread thread;
	String name;
	public Thread1(String threadName) {
		name=threadName;
		thread=new Thread(this,"Child-Thread");
		System.out.println("Child Thread : "+thread);
		thread.start();
	}
	@Override
	public void run() {
		try {
			for(int ctr=5;ctr>0;ctr--) {
				System.out.println("Child thread: "+name+" : "+ctr);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("existing child thread");
	}
}
	public class MultiThreaded{
	public static void main(String[] args) {

		new Thread1("Thread-One");
		new Thread1("Thread-Two");
		new Thread1("Thread-Three");
		try {
			Thread.sleep(30000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread existing");
	}

	}

