package Chapter05;

public class TakeTrain {
	public static void main(String[] args) {
		Student2 studentJames = new Student2("James", 5000);
		Student2 studentTomas = new Student2("Tomas", 10000);
		Student2 studentEdward = new Student2("Edward", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi1001 = new Taxi(1001);
		studentEdward.takeTaxi(taxi1001);
		studentEdward.showInfo();
		taxi1001.showInfo();
	}
}