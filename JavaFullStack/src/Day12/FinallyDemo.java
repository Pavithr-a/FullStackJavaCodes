package Day12;


public class FinallyDemo {
	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("Demo");
		}finally {
			System.out.println("ProcA's finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("Inside procB");
		}finally {
			System.out.println("ProcB's finally");
		}
	}
	static void procC() {
		try {
			System.out.println("Inside procC");
		}finally {
			System.out.println("ProcC's finally");
		}
	}
	
	public static void main(String[] args) {
		try {
			procA();
		}catch (Exception e) {
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}
