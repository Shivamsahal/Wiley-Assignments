
public class User {
	String firstName;
	String lname;
	
	
	public User() {
		this.firstName = "Shiavm";
		this.lname = "Sahal";
	}


	public User(String firstName, String lname) {
		
		this.firstName = firstName;
		this.lname = lname;
	}

	public void display()
	{
		System.out.println(firstName +" "+ lname );
	}
}
