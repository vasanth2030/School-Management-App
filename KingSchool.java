import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KingSchool implements School{
	
	static Scanner sc=new Scanner(System.in);
	
	List<Student> studentList;
	List<Teacher> teacherList;

	@Override
	public void addStudent() {
		Student student= getNewStudent();
		System.out.println(student.getStudentName()+ " has been added!");
		if(studentList==null)
		{
			studentList=new ArrayList<>();
		}
		studentList.add(student);
		
	}

	@Override
	public void addTeacher() {
		Teacher teacher= getNewTeacher();
		System.out.println(teacher.getTeacherName()+ " has been added!");
		if(teacherList==null)
		{
			teacherList=new ArrayList<>();
		}
		teacherList.add(teacher);
		
	}

	@Override
	public void showStudents() {
		for(Student stu: studentList)
		{
			System.out.println(stu);
		}
		
	}

	@Override
	public void showTeachers() {
		for(Teacher teacher: teacherList)
		{
			System.out.println(teacher);
		}
		
	}

	@Override
	public void mainPage() {
		System.out.println("===== WELCOME TO KING SCHOOL! =====");
		System.out.println("1. Add Student");
		System.out.println("2. Add Teacher");
		System.out.println("3. Show Students");
		System.out.println("4. Show Teachers");
		System.out.println("5. Exit");
		System.out.println("===================================");
		System.out.println("Enter your choice: ");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:
			addStudent();
			mainPage();
			break;
		case 2:
			addTeacher();
			mainPage();
			break;
		case 3:
			showStudents();
			mainPage();
			break;
		case 4:
			showTeachers();
			mainPage();
			break;
		case 5:
			return;
		default:
			System.out.println("Enter a valid input!");
			mainPage();
		}
		
	}
	
	public static Student getNewStudent()
	{
		System.out.println("Enter Student ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student email: ");
		String email=sc.nextLine();
		
		Student student=new Student(id,name,email);
		
		return student;
		
		
	}
	
	public static Teacher getNewTeacher()
	{
		System.out.println("Enter Teacher ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Teacher Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Course ID: ");
		int courseId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course Name:");
		String courseName=sc.nextLine();
		
		Course course=new Course(courseId,courseName);
		
		Teacher teacher=new Teacher(id,name,course);
		return teacher;
		
	}

}
