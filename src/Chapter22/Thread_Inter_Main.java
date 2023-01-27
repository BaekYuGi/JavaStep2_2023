package Chapter22;

public class Thread_Inter_Main implements Runnable {

	public static void main(String[] args) {
		System.out.println("메인 클래스 시작!");
		Thread_Inter_Main t1 = new Thread_Inter_Main();
		t1.run();
		System.out.println("메인 클래스 종료!");
		
		
	}
	@Override
		public void run() {
			System.out.println("run() 메서드 수행!");
			first();
		}
		
		public void first() {
			System.out.println("first() 메서드 수행!");
			second();
		}
		
		public void second() {
			System.out.println("second() 메서드 수행!");
		}
}
