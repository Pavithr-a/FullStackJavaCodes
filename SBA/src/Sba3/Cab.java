package Sba3;

public abstract class Cab {
	public static final String ANSI_RESET="\u001B[0m";
	public static final String ANSI_YELLOW="\u001B[33m";
	public static final String ANSI_YELLOW2="\u001B[43m";
	public static final String ANSI_BLUE="\u001B[34m";
	public static final String ANSI_PURPLE="\u001B[35m";
	public static final String ANSI_PURPLE2="\u001B[45m";
	public static final String ANSI_WHITE="\u001B[37m";
	public static final String ANSI_CYAN="\u001B[36m";
	
	

	abstract void display();
	
}
