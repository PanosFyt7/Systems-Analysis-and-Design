import java.util.Scanner;

public class User {

	protected int UserID;
	protected String Username;
	protected String Password;
	protected String Name;

	Scanner in = new Scanner(System.in);

	public int login() {
		int flag = 0;
		System.out.println("Καλως ήρθατε στο ΣΥΣΤΗΜΑ ΥΠΟΒΟΛΗΣ ΚΑΙ ΑΞΙΟΛΟΓΗΣΗΣ ΑΙΤΗΣΕΩΝ ΤΗΣ ΕΗΔΕ!");
		System.out.println("(πατήστε 0 και 0 για τερματισμό.)");
		System.out.println("Πληκτρολογήστε το username");
		this.Username = in.next();
		System.out.println("Πληκτρολογήστε το password");
		this.Password = in.next();

		if (this.Username.equals("k.vergidis@uom.edu.gr") && this.Password.equals("1234")) {
			flag = 1;
		} else if (this.Username.equals("ethics_nikelis@uom.edu.gr") && this.Password.equals("1234")) {
			flag = 2;
		} else if (this.Username.equals("0") && this.Password.equals("0")) {
			flag = 0;
		} else {
			flag = 3;
		}
		return flag;
	}

	public void setUserID(int aUserID) {
		UserID = aUserID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUsername(String aUsername) {
		Username = aUsername;
	}

	public String getUsername() {
		return Username;

	}

	public void setPassword(String aPassword) {
		Password = aPassword;
	}

	public String getPassword() {
		return Password;
	}

	public void setName(String aName) {
		Name = aName;
	}

	public String getName() {
		return Name;
	}
}