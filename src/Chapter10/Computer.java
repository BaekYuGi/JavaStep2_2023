package Chapter10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 메소드 areaCircle() 실행");
		
		return Math.PI*r*r;
			
	}
	
	
	
	
	
}
