package day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExQuantifierPlus {

	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("B+");
		Matcher matcher1=pattern.matcher("B BBB BB BBBBBBBBBBBB BBBBBBB BBB");
		while (matcher1.find()) {
			System.out.println("Match found "+matcher1.group());
		}

	}

}
