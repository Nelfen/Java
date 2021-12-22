package Chapter15;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//¸Å°³º¯¼ö ÀÚµ¿ Å¸ÀÔ º¯È¯
		driver.drive(bus); //Vehicle vehicle = bus;
		driver.drive(taxi); //Vehicle vehicle = taxi;
	}

}