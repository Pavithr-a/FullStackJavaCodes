package Day11;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	Box(double length){
		width=height=depth=length;
	}
	Box() {
		width=1;
		height=1;
		depth=1;
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	double volume() {
		return depth*width*height;
		
	}

}
