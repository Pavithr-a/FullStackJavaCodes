package Day12;

public class Student implements Cloneable{

	int id;
	String name;
	Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
