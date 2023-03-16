package Day12;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student(101, "Bala");
		System.out.println(student.id+" "+student.name);

		try {
			Student studentClone=(Student)student.clone();
			System.out.println(studentClone.id+" "+studentClone.name);
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
