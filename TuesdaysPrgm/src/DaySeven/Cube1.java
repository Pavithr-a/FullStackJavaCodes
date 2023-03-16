package DaySeven;

public class Cube1 {

	int side;
	int volume;
	
	Cube1(int side1) {
		side=side1;
	}
	
	int VolumeCube() {
		volume=side*side*side;
		return volume;
	}
	
	void Result() {
		volume=side*side*side;
		System.out.println("Void function is "+volume);
	}
}
