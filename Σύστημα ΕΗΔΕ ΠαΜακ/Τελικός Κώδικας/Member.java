import java.util.Scanner;

public class Member extends User {

	private boolean Voted;
	private boolean Interest;
	private boolean Chosen;

	Scanner in = new Scanner(System.in);

//constructor enas user na ginetai member
	public Member(User m) {
		this.UserID = m.UserID;
		this.Username = m.Username;
		this.Password = m.Password;
		this.Name = m.Name;
	}

	public int showmenu() {
		System.out.println("�������� ����� ������");
		System.out.println("1. ������� ���������� ��������");
		System.out.println("2. �����������");
		System.out.println("3. ����������");
		int choice = in.nextInt();
		return choice;
	}

	public boolean getVoted() {
		// TODO - implement Member.getVoted
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Voted
	 */
	public void setVoted(boolean Voted) {
		// TODO - implement Member.setVoted
		throw new UnsupportedOperationException();
	}

	public boolean getInterest() {
		// TODO - implement Member.getInterest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Interest
	 */
	public void setInterest(boolean Interest) {
		// TODO - implement Member.setInterest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Interest
	 */
	public void RemoveMember(boolean Interest) {
		// TODO - implement Member.RemoveMember
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Application
	 * @param Chosen
	 */
	public void Read(Application Application, boolean Chosen) {
		// TODO - implement Member.Read
		throw new UnsupportedOperationException();
	}

}