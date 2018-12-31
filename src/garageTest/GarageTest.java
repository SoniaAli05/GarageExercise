package garageTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import garageExercise.Car;
import garageExercise.Motorbike;
import garageExercise.Truck;

public class GarageTest {
	
	Car testingCar = new Car(1, "BMW", "Black", 4000, 2015, "M130iX", 4, 4); 
	Motorbike testingMotorbike = new Motorbike(4, "Yamaha", "Black", 2000, 2016, "YCL650", false); 
	Truck testingTruck = new Truck(5, "Mercedes-Benz", "Red", 28, 2014, "Large", "Pick-up Truck");

	@Test
	public void testMotorbikeManufacturer() {
		assertEquals("Yamaha", testingMotorbike.getManufacturer());
	}
	
	@Test
	public void testCarModel() {
		assertEquals("M130iX", testingCar.getModel());
	}
	
	@Test
	public void testCreateCar() {
		Car newCar = new Car(5, "Audi", "Black", 4000, 2017, "A8", 4, 7);
		assertNotNull("A new car was not created",newCar);
	}
	
	@Test
	public void testCreateTruck() {
		Truck newTruck = new Truck(7, "Mercedes-Benz", "Blue", 28, 2016, "large", "Crane Truck");
		assertNotNull("A new truck was not created",newTruck);
	}
	
	@Test
	public void testTruckColour() {
		assertNotEquals("Pink", testingTruck.getColour());
	}
	
}

