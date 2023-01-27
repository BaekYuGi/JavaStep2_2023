package Chapter10;

import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//방법 1
/*		
		System.out.println("수 1 입력 :");
		int a = s.nextInt();
		System.out.println("수 2 입력 :");
		int b = s.nextInt();
		CaluPlus c = new CaluPlus();
		CalMinus d = new CalMinus();
		
		//getClass().getSimpleName() : 클래스명 가져오기
		System.out.println("CalPlus : "+c.getResult(a, b));
		System.out.println("CalMinus : "+d.getResult(a, b));
	*/	
		//방법2
		System.out.println("수 1 입력 :");
		int a = s.nextInt();
		System.out.println("수 2 입력 :");
		int b = s.nextInt();
		
		int  plus = calc(new CaluPlus(),a,b);
		System.out.println("두 수의 합 : "+plus);
		
		int  minus = calc(new CalMinus(),a,b);
		System.out.println("두 수의 차 : "+minus);
		
		
	}
		
		public static int calc(CalculatorExam c1,int a,int b) {
		
			return c1.getResult(a, b);
		}
	

}
