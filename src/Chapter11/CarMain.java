package Chapter11;

public class CarMain {
	/*
	public static void main(String[] args) {
	
		method(new ManualCar());
		System.out.println("======================");
		method(new AICar());
		
	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}
	*/
	public static void main(String[] args) {
		Car mycar = new AICar();
		mycar.run();
		Car hiscar = new ManualCar();
		System.out.println();
	}
	
	
	
}
