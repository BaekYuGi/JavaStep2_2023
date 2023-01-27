package Chapter14.Wrapper;

public class AutoBoxingUnBoxingExample {
	
	public static void main(String[] args) {
		
		//AutoBoxing
		Integer obj1=100;
		System.out.println("value : "+obj1.intValue());
		
		//obj를 언박싱으로 자동 변환
		int value=obj1;
		System.out.println("value : "+value);
		
		//연산시 자동 unboxing
		int result=obj1+100;
		System.out.println("result : "+result);
		
	}
}
