
public class Student {
	private int studentID;
	private String studentName;
	private String email;

	Student()
	{
		
	}
	
	public Student(int studentID, String studentName, String email) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.email = email;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentID=" + studentID + ", StudentName=" + studentName + ", Email=" + email;
	}
	
	
	
	
	
	

}
