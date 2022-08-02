package ch6_3;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 Lee=new Student2();
		Lee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());//serialNum->getSerialNum()
		System.out.println(Lee.studentName+" 학번: "+Lee.studentID);
		
		Student2 Son=new Student2();
		Son.setStudentName("손흥민");
		System.out.println(Student2.getSerialNum());
		System.out.println(Son.studentName+" 학번: "+Son.studentID);
		

	}

}
