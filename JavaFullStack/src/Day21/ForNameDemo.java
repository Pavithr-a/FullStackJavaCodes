package Day21;

public class ForNameDemo {

	public static void main(String[] args) throws Exception{
		Class classObj=Class.forName("java.lang.System");
		System.out.println("Name of the class is :"+classObj.getName());
		System.out.println("Is it an interface?"+classObj.isInterface());
		String strObj=new String("This is a string arg");
		System.out.println("Class name of strObj is :"+strObj.getClass());
		System.out.println("Class name of classObj is :"+classObj.getClass());
		
	}

}
