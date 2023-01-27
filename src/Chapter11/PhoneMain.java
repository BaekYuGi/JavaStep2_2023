package Chapter11;

public class PhoneMain {

	public static void main(String[] args) {
//		Phone phone = new Phone();//(X)
		
		SmartPhone smart = new SmartPhone("김유신");
		
		System.out.println(smart.owner+"님");
		smart.turnOn();
		smart.intersearch();
		smart.turnOff();
	}

}
