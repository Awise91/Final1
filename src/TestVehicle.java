import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestVehicle {

	
	static Person a = new Person("Peter", "Griffin", Person.setPersonID());
	static Person b = new Person("Lois", "Griffin", Person.setPersonID());
	static Car c1 = new Car("Volvo", Color.lightGray, 2000, a, 4);
	static Truck t1 = new Truck("Ford", Color.red , 2500, a, 2);
	static MotorCycle m1 = new MotorCycle("Harley", Color.black, 1000, b, false);
	
	public void testTransfer() {
		t1.transferOwnership(TestVehicle.b);
	}
	
	public static void main(String[] args) {
	HashMap<UUID, Vehicle> hmap = new HashMap<UUID, Vehicle>();
	
	hmap.put(a.getPersonID(), c1);
	hmap.put(a.getPersonID(), t1);
	hmap.put(b.getPersonID(), m1);
	}
}
