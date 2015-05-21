import java.awt.Color;


public class Truck extends Vehicle {
	private static int NumberOfAxels;

	public Truck(String name, Color color, int weight, Person owner, int axelNum) {
		super(getName(), getColor(), getWeight(), getOwner());
	}
	
	public static int getNumberOfAxels() {
		return NumberOfAxels;
	}
}
