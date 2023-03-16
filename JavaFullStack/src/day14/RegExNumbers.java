package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExNumbers {

	public static void main(String[] args) {
		Pattern pattern1=Pattern.compile("[0-9]+");
		Matcher matcher1=pattern1.matcher("Hi Number 1 this is my number 9865471245");
		
		while (matcher1.find()) {
			System.out.println("Number is :"+matcher1.group());
		}

	}

}
