package Day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fileStream=new FileInputStream("serializee.txt");
			ObjectInputStream objectStream=new ObjectInputStream(fileStream);
			
			Object object=objectStream.readObject();
			
			Student student =(Student)object;
			student.StudentDetails();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
