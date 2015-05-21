import java.awt.Color;

public abstract class Vehicle implements V {
	
	private static String Name;
	private static Color Color;
	private static int Weight;
	private static Person Owner;
	
	Person transferOwnership(Person newOwner) {
		Owner = newOwner;
		return Owner;
	}
	
	public Vehicle(String name, Color color, int weight, Person owner) {
		super();
		Name = name;
		Color = color;
		Weight = weight;
		Owner = owner;
	}

	public static String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}

	public static int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public static Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}
	
}
