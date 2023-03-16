package Day12;

public class GenDemoMain {
	public static void main(String[] args) {
		GenDemo<Integer> intob =new GenDemo<Integer>(266);
		intob.ShowType();
		
		int value=intob.getObj();
		System.out.println("Value is "+value);
		
		GenDemo<String> strob=new GenDemo<String>("Pavithra");
		strob.ShowType();
		
		String word=strob.getObj();
		System.out.println("String is "+word);
	}

}
