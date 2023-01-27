package Chapter11;

public class SuperLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("아주 빨리 달립니다");
	
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("한비퀴 돕니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****고급자 입니다*****");
		
	}
	
}
