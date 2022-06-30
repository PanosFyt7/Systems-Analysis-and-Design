import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	Scanner in = new Scanner(System.in);
	
	private int ProtocolNum;
	private String FolderName;
	private ArrayList AttachedFiles;
	private String SubjectOfResearch;
	private int ApplicantID;
	private ArrayList ReseachTeamIDs;
	private String Status;


	
	public void printinfo() {
		System.out.println("Τα στοιχεία της αίτησης είναι τα παρακάτω :");
		System.out.println("Θέμα : " + SubjectOfResearch);
		System.out.println("ΑΜ Αιτούντα : " + ApplicantID);
		System.out.println("Αριθμός Πρωτοκόλλου : 00"+ ProtocolNum);
		System.out.println("Κατάσταση : " + Status);
		System.out.println("");
	}
	
	public void setID(int anID) {
		ApplicantID = anID;
	}
	
	public int getID() {
		return ApplicantID;
	}
	
	public void setSubjectOfResearch(String aSoR) {
			SubjectOfResearch = aSoR;
	}
	
	public String getSubjectOfResearch() {
		return SubjectOfResearch;
	}

	public void setProtocolNum(int aProtocolNum) {
		ProtocolNum = aProtocolNum;
	}
	
	public int getProtocolNum() {
		return ProtocolNum;
	}

	public void setStatus(String aStatus) {
		this.Status = aStatus;
	}

	public String getStatus() {
		return Status;
	}

	public String getFolderName() {
		return FolderName;
	}

	public void setFolderName(String aFolderName) {
		FolderName = aFolderName;
	}
	
	public int getApplicantID() {
		return ApplicantID;
	}


	public void setApplicantID(int aApplicantID) {
		ApplicantID = aApplicantID;
	}

	public ArrayList getAttachedFiles() {
		// TODO - implement Application.getAttachedFiles
		throw new UnsupportedOperationException();
	}

	public void setAttachedFiles(ArrayList AttachedFiles) {
		// TODO - implement Application.setAttachedFiles
		throw new UnsupportedOperationException();
	}

	public ArrayList getReseachTeamIDs() {
		// TODO - implement Application.getReseachTeamIDs
		throw new UnsupportedOperationException();
	}

	public void setReseachTeamIDs(ArrayList ReseachTeamIDs) {
		// TODO - implement Application.setReseachTeamIDs
		throw new UnsupportedOperationException();
	}
}