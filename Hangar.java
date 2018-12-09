public class Hangar {

	public static void main(String[] args) {

		Vehicle car = new Car("Aston Martin" , 12876);

		Vehicle boat = new Boat("Titanic" , 9856);

		System.out.println(car.doStuff());

		System.out.println(boat.doStuff());
	}

}
