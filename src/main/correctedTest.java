package carInfo;

public class Main {

public static int LegalCities (CameraInfo [] cameras) {

	boolean flag = true;
	int count = 0;
	for (int i = 0; i<100 ;i++){ 
		for(int j=0; j< cameras.length; j++){
			if (cameras[j].getCity() == i ) {
				if (cameras[j]. allGood() == true) {
					flag=true;
				}
				 else {
					flag = false;
				 }
      }
					if (flag== true){

					count += 1;
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

package carInfo;

public class cameraInfo {
	private int city;
	private int maxSpeed;
	private CarInfo[] cars;

	public boolean allGood(){
		for (int i = 0; i< cars.length; i++) {
			if (cars[i].illegal(maxSpeed) == true){
				return false;
			}
		}
	return true;

}
}

	
