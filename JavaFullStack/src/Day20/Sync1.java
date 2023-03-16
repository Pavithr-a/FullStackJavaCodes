package Day20;

class Callme{

	void call(String msg) {
		System.out.println("[ "+msg);
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ]");
	}
	
	
}
class Caller implements Runnable{
	String msg;
	Callme callMe;
	Thread thread;
	public Caller(Callme callMe,String str) {
		this.callMe=callMe;
		msg=str;
		thread=new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		synchronized (callMe) {
			callMe.call(msg);
		}
		
	}
	
}
public class Sync1 {

	public static void main(String[] args) {
		Callme callMe=new Callme();
		Caller obj1=new Caller(callMe, "Hello from first object");
		Caller obj2=new Caller(callMe, "This part is also synchronized");
		Caller obj3=new Caller(callMe,"First Part of synchronization");
		try {
			obj1.thread.join();
			obj2.thread.join();
			obj3.thread.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
