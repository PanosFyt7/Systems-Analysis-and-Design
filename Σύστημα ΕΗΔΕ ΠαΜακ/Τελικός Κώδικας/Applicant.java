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

	// ������� ��������� ��������� ����� ��������
	public int showmenu() {
		System.out.println("�������� ����� ��������");
		System.out.println("1. ��� ������");
		System.out.println("2. ����������� �������");
		System.out.println("3. ������� �������");
		System.out.println("4. �����������");
		System.out.println("5. ����������");
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