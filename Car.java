/**
 * Car Class
 * @author etz
 *
 */ 

public class Car extends Vehicle {
	private int doors;
	private int passengers; 
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers; 
	}
	
	
	public String toString() {
		return doors + "-doors" + getMake() + getModel() + " with license " + getPlate();
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) other;
		return super.equals(otherCar) && this.doors == otherCar.getDoors() && this.passengers == otherCar.getPassengers();
	}
	
	public Car copy() {
		return new Car(getMake(), getModel(), getPlate(), getDoors(), getPassengers());
	}
	
	
}
