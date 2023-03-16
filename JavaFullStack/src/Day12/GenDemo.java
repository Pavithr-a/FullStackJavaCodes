package Day12;

public class GenDemo<T> {

	T obj;
	GenDemo(T obj1) {
		obj=obj1;
	}
	
	T getObj() {
		return obj;
	}
	
	void ShowType() {
		System.out.println("Type of T is "+obj.getClass().getName());
	}
}
