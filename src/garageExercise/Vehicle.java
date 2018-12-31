package garageExercise;

public class Vehicle extends Garage{

	///////Attributes///////
	private int ID;
	private String manufacturer;
	private String colour;
	private int weight;
	private int yearOfManufacture;
	
	
	
	//////Constructors//////
	public Vehicle(int vID, String vManufacturer, String vColour, int vWeight, int vYearOfManufacture) {
		this.ID = vID;
		this.manufacturer = vManufacturer;
		this.colour = vColour;
		this.weight = vWeight;
		this.yearOfManufacture = vYearOfManufacture;
	}


	
	////////Methods////////
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public void accelerate() {
		
	}
	
	public void brake() {
		
	}
	
}
