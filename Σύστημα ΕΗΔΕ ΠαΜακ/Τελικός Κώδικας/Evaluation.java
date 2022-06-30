import java.util.Scanner;

public class Evaluation {

	Scanner in = new Scanner(System.in);
	
	private String Verdict;
	private String Text;
	private int ProtocolNum;
	private int UserID;

	
	public Evaluation evaluate (Application anApplication) {
		Evaluation eval = new Evaluation();
		System.out.println("Εγκρίνεται ή Δεν Εγκρίνεται;");
		eval.setVerdict(in.nextLine());
		System.out.println("Αιτιολογίστε την αξιολόγησή σας : ");
		eval.setText(in.nextLine());
		eval.setProtocolNum(anApplication.getProtocolNum());
		eval.setUserID(anApplication.getApplicantID());
		System.out.println("Η Αξιολόγησή σας έχει υποβληθεί.");
		return eval;		
	}
	
	public String getVerdict() {
		return Verdict;
	}

	public void setVerdict(String aVerdict) {
		Verdict = aVerdict;
	}

	public String getText() {
		return Text;
	}

	public void setText(String aText) {
		Text = aText;
	}

	public int getProtocolNum() {
		return ProtocolNum;
	}

	public void setProtocolNum(int aProtocolNum) {
		ProtocolNum = aProtocolNum;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int aUserID) {
		UserID = aUserID;
	}

}