package Day11;

public class BoxWeight extends Box{
	double weight;
	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}
	
	BoxWeight(double length,double weight){
		super(length);
		this.weight=weight;
	}
	
	BoxWeight() {
		super();
		weight=10;
	}
	
	BoxWeight(double width,double height,double depth,double weight){
		super(width,height,depth);
		this.weight=weight;
	}

}
