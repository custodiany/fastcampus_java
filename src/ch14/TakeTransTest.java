package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		Student edward = new Student("Edward", 20000);
		Bus bus = new Bus(100);
		Subway subway = new Subway("Green");
		Taxi taxi = new Taxi("JNGD");
		james.takeBus(bus);
		tomas.takeSubway(subway);
		edward.takeTaxi(taxi);
		james.showInfo();
		tomas.showInfo();
		edward.showInfo();
		bus.showBusInfo();
		subway.showSubwayInfo();
		taxi.showTaxiInfo();
	}

}
