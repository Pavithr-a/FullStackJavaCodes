package Day19;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		DataInputStream datainput=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("File1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		char char1;
		while ((char1=(char)datainput.read())!='@') {
			fout.write(char1);
		}fout.close();

	}

}
