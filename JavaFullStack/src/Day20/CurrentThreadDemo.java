package Day20;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread mainThread=new Thread();
		System.out.println("Main thread: "+mainThread);
		mainThread.setName("ThreadMain-2023");
		System.out.println("Main thread: "+mainThread);
		for(int ctr=10;ctr>0;ctr--) {
			System.out.println(ctr);
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println("End");

	}

}
