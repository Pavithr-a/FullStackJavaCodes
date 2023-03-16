package day13;

public class TwoArgGenMain {
	public static void main(String[] args) {
		TwoArgGen< Integer, String> tagObj=new TwoArgGen<Integer, String>(150, "Pavi");
		
		tagObj.ShowTypes();
		
		int intVal=tagObj.getTObj();
		System.out.println("Value of int is "+intVal);
		System.out.println("Value of String is "+tagObj.getVObj());
	}

}
