package Day11;


public class Shipment extends BoxWeight{

	int cost;
	String color;
	
	Shipment(Shipment ob){
		super(ob);
		cost=ob.cost;
		color=ob.color;
	}
	
	Shipment() {
		super();
		cost=10000;
		color="Blue";
	}
	Shipment(double  width,double height,double depth,double weight,int cost,String color){
		super(width,height,depth,weight);
		this.cost=cost;
		this.color=color;
		
	}
	
	Shipment(double length,double weight,int cost,String color){
		super(length,weight);
		this.cost=cost;
		this.color=color;
		
	}
		
		
}
