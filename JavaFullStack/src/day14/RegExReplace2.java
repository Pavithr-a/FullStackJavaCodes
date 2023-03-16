package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExReplace2 {

	public static void main(String[] args) {
		String names="Mad is Maddy when Madhan becomes Madhesh ";
		Pattern pattern1=Pattern.compile("Mad.*? ");
		Matcher matcher1=pattern1.matcher(names);
		
		System.out.println("Original: "+names);
		names=matcher1.replaceAll("Mike ");
		System.out.println("Replacement names: "+names);
		

	}

}
