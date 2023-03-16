package SBA7Payment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails1{

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED ="\u001B[31m" ;
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN="\u001B[32m";
	public static final String ANSI_PURPLE="\u001B[35m";
	public static final String ANSI_BLUE="\u001B[34m";
	public static final String ANSI_BLACK="\u001B[30m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BLACKBG="\u001B[40m";
	public static final String ANSI_CYANBG = "\u001B[46m";
	public static final String ANSI_WHITEBG = "\u001B[47m";

	Scanner sc=new Scanner(System.in);
	String email,password;
	
	void Signup() {
		System.out.println("SIGNUP");
		System.out.println("Enter email-id:");
		email=sc.nextLine();
		Pattern pat=Pattern.compile("^[A-Za-z0-9+_.-]+@gmail.com");
		Matcher mat=pat.matcher(email);
		boolean isValid=mat.matches();
		if(isValid) {
			UserPassword();
		}
		else {
			System.out.println("Please enter the valid Email Id");
			Signup();
		}
	}
	public void UserPassword() {
		System.out.println("Please create your Password.");
		System.out.println("Make your password strong with numbers,uppercase and lowercase letters");
		password=sc.next();
		Pattern pat1=Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%$]).{8,20})");
		Matcher mat1=pat1.matcher(password);
		boolean found=mat1.matches();
		if(found) {
			System.out.println("You have successfully created the account");
			
		}
		else {
			System.out.println("Please create a password with valid Characters");
			UserPassword();
		
	}
	}
}
