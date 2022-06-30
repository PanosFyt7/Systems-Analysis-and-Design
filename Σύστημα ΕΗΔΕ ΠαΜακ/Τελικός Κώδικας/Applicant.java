import java.util.ArrayList;
import java.util.Scanner;

public class Applicant extends User {

	private ArrayList ApplicationList;

	
	public Applicant(User u) {
		this.UserID = u.UserID;
		this.Username = u.Username;
		this.Password = u.Password;
		this.Name = u.Name;
	}
	Scanner in = new Scanner(System.in);

	// μέθοδος εμφάνησης κεντρικού μενού αιτούντα
	public int showmenu() {
		System.out.println("Κεντρική οθόνη αιτούντα");
		System.out.println("1. Νέα Αίτηση");
		System.out.println("2. Επεξεργασία Αίτησης");
		System.out.println("3. Έλεγχος Αίτησης");
		System.out.println("4. Ενημερώσεις");
		System.out.println("5. Αποσύνδεση");
		int choice = in.nextInt();
		return choice;
	}

	public Application Submit(int UserID, String SubjectOfResearch, ArrayList AttachedFiles,
			ArrayList ResearchTeamIDs) {
		// TODO - implement Applicant.Submit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Application
	 */
	public void addApplicationToMyList(Application Application) {
		// TODO - implement Applicant.addApplicationToMyList
		throw new UnsupportedOperationException();
	}

	public ArrayList getApplicationList() {
		// TODO - implement Applicant.getApplicationList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ApplicationList
	 */
	public void setApplicationList(ArrayList ApplicationList) {
		// TODO - implement Applicant.setApplicationList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ProtocolNum
	 */
	public void download(int ProtocolNum) {
		// TODO - implement Applicant.download
		throw new UnsupportedOperationException();
	}

}