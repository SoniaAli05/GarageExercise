package garageExercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		Vehicle Car1 = new Car(1, "BMW", "Black", 4000, 2015, "M130iX", 4, 4);
		Vehicle Car2 = new Car(2, "Mercedes-Benz", "Silver", 6000, 2014, "A Class A180d", 4, 4);
		Vehicle Motorbike1 = new Motorbike(3, "Aprilia Tuono", "Black", 2000, 2017, "V4 1100", true);
		Vehicle Motorbike2 = new Motorbike(4, "Yamaha", "Black", 2000, 2016, "YCL650", false);
		Vehicle Truck1 = new Truck(5, "Mercedes-Benz", "Red", 28, 2014, "Large", "Pick-up Truck");
		
		vehicles.add(Car1);
		vehicles.add(Car2);
		vehicles.add(Motorbike1);
		vehicles.add(Motorbike2);
		vehicles.add(Truck1);
		
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}

	}

}
