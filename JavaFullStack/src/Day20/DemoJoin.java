package Day20;

class NewThread2 implements Runnable{
	Thread thread;
	String name;
	public NewThread2(String threadName) {
		name=threadName;
		thread=new Thread(this,"Child-Thread");
		System.out.println("Child Thread: "+thread);
		thread.start();
	}
	
	@Override
	public void run() {
		try {
			for(int ctr=5;ctr>0;ctr--) {
				System.out.println(name+" : "+ctr);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" Exiting ");
	}
	
}
public class DemoJoin {

	public static void main(String[] args) {
		NewThread2 obj1=new NewThread2("Thread-One");
		NewThread2 obj2=new NewThread2("Thread-Two");
		NewThread2 obj3=new NewThread2("Thread-Three");
		System.out.println("Is Thread-One is alive :"+obj1.thread.isAlive());
		System.out.println("Is Thread-Two is alive :"+obj2.thread.isAlive());
		System.out.println("Is Thread-Three is alive :"+obj3.thread.isAlive());

		try {
			obj1.thread.join();
			obj2.thread.join();
			obj3.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Is Thread-One is alive :"+obj1.thread.isAlive());
		System.out.println("Is Thread-Two is alive :"+obj2.thread.isAlive());
		System.out.println("Is Thread-Three is alive :"+obj3.thread.isAlive());
		System.out.println("Main thread exits");
	}

}
