package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCase {

	public static void main(String[] args) {
		Pattern pattern1=Pattern.compile("[A-Z]+");
		Matcher matcher1=pattern1.matcher("we are in lower case WE ARE IN UPPER CASE We Are in Mixed Case");
		
		while (matcher1.find()) {
			System.out.println("UPPER CASE: "+matcher1.group());
		}
		
		Pattern pattern2=Pattern.compile("[a-z]+");
		Matcher matcher2=pattern2.matcher("we are in lower case WE ARE IN UPPER CASE We Are in Mixed Case");
		
		while (matcher2.find()) {
			System.out.println("Lowe case :"+matcher2.group());
		}

	}

}
