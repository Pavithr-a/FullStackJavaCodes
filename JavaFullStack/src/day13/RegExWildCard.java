package day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExWildCard {
	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("f.+y");
		Matcher matcher1=pattern.matcher("my family is funny like a fairy very frequently");
		//Matcher matcher1=pattern.matcher("My family is kind");
		while (matcher1.find()) {
			System.out.println("Matching sequence :"+matcher1.group());
		}
	}

}
