import java.util.ArrayList;

public class Application_Catalog {
	private ArrayList<Application> Applications;

	// constructor
	public Application_Catalog() {
		Applications = new ArrayList<Application>();
	}

	public void addNewApplication(Application aApplication) {
		Applications.add(aApplication);
	}

	public void printApplications() {
		System.out.println("AA|" + "| ΑΜ  |" + "|                Θέμα                |" + "|          Όνομα φακέλου          |");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < Applications.size(); i++) {
			System.out.println(i + ".|" + Applications.get(i).getID() + "||" + Applications.get(i).getSubjectOfResearch() + "||"
					+ Applications.get(i).getFolderName());

		}
		System.out.println();
	}

	public Application getApp(int i) {
		return Applications.get(i);
	}
}