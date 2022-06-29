import java.util.Scanner;

public class Main {

	private static Application_Catalog generateAppCat() {
		Application_Catalog appCatalog = new Application_Catalog();
//δημιουργία αιτήσεων
		Application application1 = new Application();
		application1.setApplicantID(7729);
		application1.setSubjectOfResearch("Submarine Drone for Waste Collection");
		application1.setProtocolNum(1);
		application1.setFolderName("STEIAKAKIS_EMMANOUIL_26052022");

		Application application2 = new Application();
		application2.setApplicantID(7732);
		application2.setSubjectOfResearch("Information System foe Wildfire Prevention");
		application2.setProtocolNum(2);
		application2.setFolderName("EUTIMIOS_TAMPOURIS_26052022");
//προσθήκη σε κατάλογο
		appCatalog.addNewApplication(application1);
		appCatalog.addNewApplication(application2);
		return appCatalog;
	}

	private static Credentials_Catalog generateCredsCat() {
		Credentials_Catalog credsCatalog = new Credentials_Catalog();
//δημιουργία χρηστών
		User user1 = new User();
		user1.setName("K.Vergidis");
		user1.setUsername("k.vergidis@uom.edu.gr");
		user1.setPassword("1234");
		user1.setUserID(7739);

		User user2 = new User();
		user2.setName("K.Nikelis");
		user2.setUsername("ethics_nikelis@uom.edu.gr");
		user2.setPassword("1234");
		user2.setUserID(7734);
//προσθήκη σε κατάλογο
		credsCatalog.addNewUser(user1);
		credsCatalog.addNewUser(user2);
		return credsCatalog;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Application_Catalog appCatalog = generateAppCat();
		Credentials_Catalog credsCatalog = generateCredsCat();

		User user1 = credsCatalog.getUser(0);
		Applicant applicant = new Applicant(user1);

		User user2 = credsCatalog.getUser(1);
		Member member1 = new Member(user2);

		Evaluation eval = new Evaluation();

		int flag = 0;
		// Βρόγχος για Σελίδα login
		while (true) {
			flag = user1.login();
			int choice = 0;
			if (flag == 1) {
				do {
					// Εμφάνιση Κεντρικού μενού αιτούντα
					choice = applicant.showmenu();

					if (choice == 1) {
						//συμπληρωση αίτησης από κονσόλα
						Application application3 = new Application();
						application3.setID(applicant.getUserID());
						System.out.println("Συμπληρώστε τα στοιχεία της αίτησης : ");
						System.out.println("Θέμα Έρευνας : ");
						application3.setSubjectOfResearch(in.nextLine());
						application3.setFolderName("VERGIDIS_KOSTAS_28062022");

						while (true) {
							System.out.println("Πατήστε 1 για Υποβολή και 2 για Προσωρινή Αποθήκευση.");
							choice = in.nextInt();
							if (choice == 1) {
								// Θεωρούμε ότι η Γραμματεία έκανε τον έλεγχο πληρότητας, η αίτηση
								// χαρακτηρίζεται πλήρης, και πρωτοκολλείται
								application3.setStatus("Πλήρης");
								application3.setProtocolNum(3);

								// Προσθήκη αίτησης στον κατάλογο αιτήσεων
								appCatalog.addNewApplication(application3);

								// εκτύπωση στοιχείων αίτησης
								application3.printinfo();

								System.out.println(
										"Η αίτηση σας καταχωρήθηκε επιτυχώς και θα περάσει στο στάδιο Αξιολόγησης.");
								System.out.println("");
								break;
							} else if (choice == 2) {
								System.out.println(
										"Η αίτησή σας αποθηκέυτηκε. Μπορείτε να συνεχίσετε την επεξεργασία της σε δεύτερο χρόνο.");
								application3.setStatus("Εκκρεμμεί");
								applicant.showmenu();
								break;
							} else {
								System.out.println("Παρακαλώ πληκτρολογείστε 1 ή 2");
							}
						}

					}
					/*δεν υλοποιήθηκαν
					 * else if (choice == 2) { ..... } else if (choice == 3) { ..... } else if
					 * (choice == 4) { ..... }
					 */

				} while (choice != 5);
				System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
				System.out.println("--------------------------------------------------------");
			} else if (flag == 2) {
				do {
					//εμφάνιση μενού μέλους
					choice = member1.showmenu();
					int appChoice = 0;
					if (choice == 1) {
						//εμφάνιση αιτήσεων προς αξιολόγηση
						System.out.println("Λίστα Αιτήσεων");
						appCatalog.printApplications();
						System.out.println("Επιλέξτε αίτηση για Αξιολόγηση");
						appChoice = in.nextInt();
						//επιλογή αίτησης για αξιολόγηση από κονσόλα
						Application chosen = appCatalog.getApp(appChoice);
						eval = eval.evaluate(chosen);
						System.out.println(
								"H Αξιολόγηση με Αρ Πρωτ." + chosen.getProtocolNum() + " αξιολογήθηκε ως εξής:");
						System.out.println(eval.getVerdict());
						System.out.println(eval.getText());
						System.out.println("");
					} else if (choice == 2) {
						System.out.println("Εδώ θα εμφανίζονται οι ειδιποιήσεις");
					}
				} while (choice != 3);
				System.out.println("Πραγματοποιείται έξοδος. Καλή συνέχεια!");
				System.out.println("--------------------------------------------------------");
			}

			else if (flag == 0) {
				System.out.println("Αντίστοιχες συνάρτηση με την  printData() της εκφώνησης.");
				appCatalog.printApplications();
				break;
			} else {
				System.out.println("Λάθος στοιχεία! Παρακαλώ επαναλάβετε.");
				System.out.println("--------------------------------------------------------");
			}
		}
	}
}
