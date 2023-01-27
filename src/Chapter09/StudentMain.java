package Chapter09;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student("홍길동", "010-1111-2222", 10000);
			
		
		System.out.println("name : "+stu.name);
		System.out.println("ssn : "+stu.ssn);
		System.out.println("studentNo : "+stu.studentNo);
	}

}
