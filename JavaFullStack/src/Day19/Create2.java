package Day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Create2 {

	public static void main(String[] args) throws IOException{
		String myTextMsg="This text is from create2.java";
		FileWriter filew=new FileWriter("File2.txt");
		BufferedWriter bufferw=new BufferedWriter(filew);
		for(int ctr=0;ctr<myTextMsg.length();ctr++) {
			bufferw.write(myTextMsg.charAt(ctr));
		}bufferw.close();

	}

}
