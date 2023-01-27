package Chapter16.generic1;

public class GenExMain {
	
	public static void main(String[] args) {
		//사용자가 원하는 형태로 객체 생성
	
		GenEx<String> v1= new GenEx<String>();
		
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//정수, 실수, 문자
		//제네릭 타입의 객체는 기본자료형(int, double, char)을 인식할수 없음
		//그러므로 오토박싱하여 사용
		GenEx<Integer> v2 = new GenEx<Integer>();
		
		v2.setValue(10);
		System.out.println(v2.getValue());
		
		
		GenEx<Double> v3 = new GenEx<Double>();
		v3.setValue(20.2);
		System.out.println(v3.getValue());
		
		
	}
	
}
