package carInfo;

public class Main {

public static int LegalCities (CameraInfo [] cameras) {

	boolean flag = true;
	int count = 0;
	for (int i = 0; i<100 ;i++){ 
		for(int j=0; j< cameras.length; j++){
			if (cameras[j].getCities == i ) {
				if (cameras[j]. allGood == true) {
					flag=true;
				}
				 else {
					flag = false;
				 }
					if (flag== true){

					count += 1;
					}
			}
		}
	}
	return count;

}
}

package carInfo;

public class CarInfo {
	
	private String id;
	private boolean privateCar;
	private int speed;
	
	public boolean illegal(int maxSpeed) {
		if((speed>maxSpeed)||(privateCar==true)) {
			return true;
		}
		else {
			return false;
		}
	}
}

	
