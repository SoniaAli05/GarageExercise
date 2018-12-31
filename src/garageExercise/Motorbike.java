package garageExercise;

public class Motorbike extends Vehicle {

	///////Attributes///////
	private String model;
	private boolean hasStorage;	
	
	//////Constructors//////
	public Motorbike(int vID, String vManufacturer, String vColour, int vWeight, int vYearOfManufacture, String vModel, boolean vHasStorage) {
		super(vID, vManufacturer, vColour, vWeight, vYearOfManufacture);
		this.model = vModel;
		this.hasStorage = vHasStorage;
	}
	
	
	////////Methods////////
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean getHasStorage() {
		return hasStorage;
	}

	public void setHasStorage(boolean hasStorage) {
		this.hasStorage = hasStorage;
	}
	
	public String toString() {
		if(hasStorage) {
		return (this.getID() + ": This " + this.getColour() + " motorcycle is a " + this.getYearOfManufacture() + " " + this.getManufacturer() + " " + this.getModel() + ", it weighs " + this.getWeight() + " pounds and it has storage space.");
		}
		else {
			return (this.getID() + ": This " + this.getColour() + " motorcycle is a " + this.getYearOfManufacture() + " " + this.getManufacturer() + " " + this.getModel() + " and it weighs " + this.getWeight() + " pounds.");
		}
	}
	
}
