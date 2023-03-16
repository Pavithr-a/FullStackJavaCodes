package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExReplace {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=scanner.nextLine();
		String regex="monkey";
		String rep="donkey";
		Pattern pattern1=Pattern.compile(regex);
		Matcher matcher1=pattern1.matcher(str);

		System.out.println(matcher1.replaceAll(rep));
		//System.out.println(matcher1.replaceAll("donkey"));
	}

}
