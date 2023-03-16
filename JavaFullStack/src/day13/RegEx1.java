package day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat=Pattern.compile("Java"); //syntax
		mat=pat.matcher("Java");
		found=mat.matches();
		System.out.println("Testing Java==Java");
		if(found) {
			System.out.println("It matches");
		}
		else {
			System.out.println("Doesn't match");
		}
		
		mat=pat.matcher("Java is a programming language, I love coding in Java ");
		found=mat.matches();
		if(found) {
			System.out.println("Matches");
		}
		else {
			System.out.println("Doesn't match");
		}

	}

}
