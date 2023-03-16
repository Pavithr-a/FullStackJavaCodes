package day14;

import java.util.regex.Pattern;

public class RegExSplit {
	public static void main(String[] args) {
		Pattern pat=Pattern.compile("[ ,.!]");
		String strs[]=pat.split("Hello World,Welcome to Regex.Using!Split");
		for(int ctr=0;ctr<strs.length;ctr++) {
			System.out.println("Token "+ctr+" : "+strs[ctr] );
		}
	}

}
