package Chaper08;

public class Student2 {
	
	public static int serialNum=9999;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		serialNum++;
		StudentName = studentName;
	}
	public static int getSerialNum() {
		
	
		return serialNum;
	}
	
}
