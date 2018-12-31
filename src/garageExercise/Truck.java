package garageExercise;

public class Truck extends Vehicle {
	///////Attributes///////
	private String size;
	private String type;	
	
	//////Constructors//////
	public Truck(int vID, String vManufacturer, String vColour, int vWeight, int vYearOfManufacture, String vSize, String vType) {
		super(vID, vManufacturer, vColour, vWeight, vYearOfManufacture);
		this.size = vSize;
		this.type = vType;
	}
	
	
	////////Methods////////
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
			return (this.getID() + ": This " + this.getSize() + " " + this.getColour() + " truck is a " + this.getYearOfManufacture() + " " + this.getManufacturer() + " " + this.getType() + " and it weighs " + this.getWeight() + " ton.");
	}
}
