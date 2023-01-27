package Chapter10;

import java.util.Scanner;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		Scanner s = new Scanner(System.in);
		System.out.print("반지릅 입력 : ");
		int i = s.nextInt();

		System.out.println(com.areaCircle(i));
		
		
	}

}
