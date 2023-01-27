package Chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();
		tv.search("www.namer.com");
		System.out.println("-------------------");
		//Remote 클래스에 정의 되어 있는 메소드만 오버라이딩이 인식되어 사용할 수 있음
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		//rc.search("www.namer.com");
		System.out.println("-------------------");
		
		Seachable sc = tv;
//		sc.turnOn();
//		sc.setVolume(8);
//		sc.turnOff();
		sc.search("www.namer.com");
		
	}

}
