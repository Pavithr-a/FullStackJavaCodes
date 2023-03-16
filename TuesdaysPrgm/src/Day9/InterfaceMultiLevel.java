package Day9;

public class InterfaceMultiLevel implements Three {

	@Override
	public void display2() {
		System.out.println("Display2  method");
	}

	@Override
	public void display1() {
		System.out.println("Display1  method");
	}

	@Override
	public void display3() {
		System.out.println("Display3  method");
	}

}
