package src;

public class Student {
	public String firstName;
	public String lastName;
	public int expectedGradYear;
	public double gpa;
	public String major;
	
	public Student(String firstName, String lastName, int expectedGradYear, double gpa, String major) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.expectedGradYear = expectedGradYear;
		this.gpa = gpa;
		this.major = major;
	}
	
	public int partyPary() {
		return this.expectedGradYear++;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", expectedGradYear=" + expectedGradYear
				+ ", gpa=" + gpa + ", major=" + major + "]";
	}
	
	
}
