package DaySeven;

public class Cube2 {
	int side;
	int volume;
	
	void Task3Init(int side1) {
		side=side1;
	}
	
	int VolumeCube() {
		volume=side*side*side;
		return volume;
	}

}
