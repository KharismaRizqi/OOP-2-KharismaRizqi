package system;
import systemfloar.Floar;

public class lift {
	
	//make atribute
	
	int kapasitas ;
	String lol;
	int alarm;
	int lantai;

	int emergency;
	int call;
	int doorSensor;
	boolean Ready; 
	
	
	void berat() {
		if (kapasitas > 30) {
			System.out.println("Warning Capacity Is Full");
		} else if (kapasitas <= 15) {
			System.out.println("Half Capacity To Stay !!!");
		} else if (kapasitas <= 5) {
			System.out.println("don't worry, there is still a lot of capacity");
		
		}
	}
	
	public static void main (String[] args) {
		Floar flr = new Floar();
		
		flr.lantai();
	}
			
	
}

