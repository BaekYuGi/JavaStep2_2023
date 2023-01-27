package Chapter11;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
			
	public void trunOff() {
		System.out.println("시동을 끕니다");
	}
	
	//탬플릿 메소드(재정의가 안되게 구현)
	public final void run() {
		startCar();
		drive();
		stop();
		trunOff();
	}
	
	
}
