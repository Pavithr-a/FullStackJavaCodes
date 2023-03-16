package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=scanner.nextLine();
		String regex="monkey";
		
		Pattern pattern1=Pattern.compile(regex);
		Matcher matcher1=pattern1.matcher(str);
		
		/*if(matcher1.find()) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found");
		}*/
		
		while(matcher1.find()) {
			System.out.println(matcher1.group()+" is matched from "+matcher1.start()+" to "+matcher1.end());
		}

	}

}
