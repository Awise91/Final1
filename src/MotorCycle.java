import java.awt.Color;


public class MotorCycle extends Vehicle {
	private boolean hasSideCar;
	
	public MotorCycle(String name, Color color, int weight, Person owner, boolean hasSide) {
		super(getName(), getColor(), getWeight(), getOwner());
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
}

