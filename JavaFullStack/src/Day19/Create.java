package Day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("File1.txt");
		FileOutputStream fos=new FileOutputStream("File3.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int ctr;
		while((ctr=bis.read())!=-1) {
			bos.write(ctr);
		}
		bis.close();
		bos.close();
		
	}

}
