package Day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ARMDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		int ctr;
		try(FileInputStream fis=new FileInputStream("File1.txt")){
			do {
				ctr=fis.read();
				if(ctr!=-1) {
					System.out.print((char)ctr);
				}
				
			}while(ctr!=-1);
		}catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		}

	}

}
