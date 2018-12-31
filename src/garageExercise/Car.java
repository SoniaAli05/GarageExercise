package garageExercise;

public class Car extends Vehicle {

	///////Attributes///////
	private String model;
	private int wheels;
	private int seats;
	
	
	//////Constructors//////
	public Car(int vID, String vManufacturer, String vColour, int vWeight, int vYearOfManufacture, String vModel, int vWheels, int vSeats) {
		super(vID, vManufacturer, vColour, vWeight, vYearOfManufacture);
		this.model = vModel;
		this.wheels = vWheels;
		this.seats = vSeats;
	}
	
	
	////////Methods////////
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String toString() {
		return (this.getID() + ": This " + this.getSeats() + " seater car is a " + this.getColour() + " " + this.getYearOfManufacture() + " " + this.getManufacturer() + " " + this.getModel() + ", it weighs " + this.getWeight() + " pounds and has " + this.getWheels() + " wheels.");
	}
	
}
