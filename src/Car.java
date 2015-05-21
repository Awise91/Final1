import java.awt.Color;

public class Car extends Vehicle {
	private int NumberOfDoors;
	
	public Car(String name, Color color, int weight, Person owner, int doorNum) {
		super(getName(), getColor(), getWeight(), getOwner());
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
}
