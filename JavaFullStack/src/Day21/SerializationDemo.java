package Day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException{
		try {
			//Create a subject object
			Student student =new Student(100, "Bala", 99.90f);
			//Create a low level stream pointing to the file
			FileOutputStream fileStream=new FileOutputStream("Serializee.txt");
			//Create a high level stream 
			ObjectOutputStream objStream=new ObjectOutputStream(fileStream);
			objStream.writeObject(student);
			//close stream objects
			System.out.println("Serialization done");
			fileStream.close();
			objStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
