package Chapter10;

import java.util.Scanner;

public class SupersonicAirplane extends Airplane {
	// NOMAL = 1 SUPERSONIC = 2
	// 필드(전역변수,변경할 수 없게 선언)
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NOMAL;
	Airplane air = new Airplane();
	Scanner s = new Scanner(System.in);

	@Override
	public void fly() {

		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행기입니다");
			return;
		} else {
			super.fly();
		}
	}
}
