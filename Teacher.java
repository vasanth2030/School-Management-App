
public class Teacher {
	
	private int teacherID;
	private String teacherName;
	private Course course;
	
	Teacher()
	{
		
	}
	
	
	Teacher(int teacherID,String teacherName, Course course)
	{
		this.teacherID=teacherID;
		this.teacherName=teacherName;
		this.course=course;
	}


	public int getTeacherID() {
		return teacherID;
	}


	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "TeacherID= " + teacherID + ", TeacherName= " + teacherName + ", Course=" + course;
	}
	
	
	
	

}
