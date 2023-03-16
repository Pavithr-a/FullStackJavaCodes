package Day11;

public class BoxMain {
	public static void main(String[] args) {
		BoxWeight boxWeightTwo=new BoxWeight(20,25);
		System.out.println("BoxWeightTwo Volume is "+boxWeightTwo.volume());
		System.out.println("BoxWeightTwo Weight is "+boxWeightTwo.weight);
		System.out.println();
		
		Shipment shipTwo=new Shipment(20,25,10000,"Green");
		System.out.println("ShipmentTwo cost is "+shipTwo.cost);
		System.out.println("ShipmentTwo color is "+shipTwo.color);
		System.out.println();
		
		BoxWeight boxWeightOne=new BoxWeight(10,15,20,21);
		System.out.println("BoxWeightOne Volume is "+boxWeightOne.volume());
		System.out.println("BoxWeightOne Weight is "+boxWeightOne.weight);
		System.out.println();
		
		Shipment shipOne=new Shipment(10,15,20,21,20000,"Red");
		System.out.println("ShipmentOne cost is "+shipOne.cost);
		System.out.println("ShipmentOne color is "+shipOne.color);
		System.out.println();
		
		BoxWeight boxWeight=new BoxWeight();
		System.out.println("BoxWeight Volume is "+boxWeight.volume());
		System.out.println("BoxWeight Weight is "+boxWeight.weight);
		System.out.println();
		
		Shipment ship=new Shipment();
		System.out.println("Shipment cost is "+ship.cost);
		System.out.println("Shipment color is "+ship.color);
		System.out.println();
		
		BoxWeight boxWeightObj=new BoxWeight(boxWeightTwo);
		System.out.println("BoxWeightObj Volume is "+boxWeightObj.volume());
		System.out.println("BoxWeightObj Weight is "+boxWeightObj.weight);
		System.out.println();
		
		Shipment shipObj=new Shipment();
		System.out.println("ShipmentObj cost is "+shipObj.cost);
		System.out.println("ShipmentObj color is "+shipObj.color);
	}

}