package Chapter09;

public class Fruit {
	
	private String sort;
	private String season;
	
	//생성자
	
	//setter
	public void Set1(String a, String b) {
		sort =a;
		season=b;
	}
	
	
	//getter
	public void Dis1() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		
	}
	
	
}
