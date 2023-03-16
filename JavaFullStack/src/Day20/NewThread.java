package Day20;

public class NewThread implements Runnable{

	Thread thread;
	public NewThread() {
		thread=new Thread(this,"Child-Thread");
		System.out.println("Child Thread: "+thread);
		thread.start();
	}
	@Override
	public void run() {
		try {
		for(int ctr=5;ctr>0;ctr--) {
			System.out.println("Child thread: "+ctr);
			Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("existing child class");
		
	}

	public static void main(String[] args) {
		new NewThread();
		try {
			for(int ctr=5;ctr>0;ctr--) {
				System.out.println("Main thread: "+ctr);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread exists");
	}

}
