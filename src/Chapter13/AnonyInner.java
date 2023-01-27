package Chapter13;

public class AnonyInner {
	
	public void test() {
		
		new TestInter() {
			
			@Override
			public void printData() {
				System.out.println("화욜팅!!");
			}//추상메소드 구현
		}.printData();
		
	}
	
	public static void main(String[] args) {
		
		AnonyInner in = new AnonyInner();
		in.test();
		
	}

}
