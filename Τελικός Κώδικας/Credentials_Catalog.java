import java.util.ArrayList;

public class Credentials_Catalog {
	private ArrayList<User> Credentials;

	
	//constructor
	public Credentials_Catalog() {
		Credentials = new ArrayList<User>();
	}
	public void addNewUser(User aUser) {
		Credentials.add(aUser);
	}
	
	public User getUser(int i) {
		return Credentials.get(i);
	}
	public void printCreds() {
		System.out.println("ID");
		for(int i =0; i<Credentials.size();i++) {
			System.out.println(Credentials.get(i).getUsername());
			System.out.println(Credentials.get(i).getPassword());
		}
		System.out.println();
	}
}