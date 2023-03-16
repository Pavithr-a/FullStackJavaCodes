package Day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String[] args) throws IOException {
		char char1;
		BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data in characters , 'q 'to quit ");
		do {
			char1=(char)bufferReader.read();
			System.out.println(char1);
		}while(char1!='q');
		BufferedReader buffereadString=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter text and 'stop' to quit ");
		do {
			str=buffereadString.readLine();
			System.out.println(str);
			
		}while(!str.equals("stop"));

	}
 
}
