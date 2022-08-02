package ch6_3;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee=new Student();
		Lee.setStudentName("이지원");
		System.out.println(Student.serialNum);//Lee 대신 Student
		System.out.println(Lee.studentName+" 학번: "+Lee.studentID);
		
		Student Son=new Student();
		Son.setStudentName("손흥민");
		System.out.println(Son.serialNum);
		System.out.println(Son.studentName+" 학번: "+Son.studentID);
		

	}

}
