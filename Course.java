
public class Course {
	private int courseID;
	private String courseName;
	
	Course(){
		
	}

	public Course(int courseID, String courseName) {
		this.courseID = courseID;
		this.courseName = courseName;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "CourseID= " + courseID + ", CourseName=" + courseName;
	}
	
	

	
}
