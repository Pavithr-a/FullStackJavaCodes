package day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFindDemo {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("java is fun"); //It looks out for the entire sentence
		Matcher matcher1=pattern.matcher("Java is a powerful programming language. Coding in java is fun");
		System.out.println("Looking for Java in sequence");
		/*if(matcher1.find()) {
			System.out.println("found java in sub sequence");
		}
		else {
			System.out.println("Not found");
		}*/
		while(matcher1.find()) {
			System.out.println("Java found at index "+matcher1.start());
			System.out.println("Java found at index "+matcher1.end());
		}
	}

}
