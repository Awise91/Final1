import java.util.UUID;


public class Person {
	private String FirstName;
	private String LastName;
	private static UUID PersonID;
	
	public Person(String firstName, String lastName, UUID personID) {
		super();
		FirstName = firstName;
		LastName = lastName;
		PersonID = personID;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public static UUID setPersonID() {
		return PersonID = UUID.randomUUID();
	}
}
