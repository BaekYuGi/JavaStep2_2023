package Chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("--------곰--------");
		System.out.println("눈은 "+new Bear().getEye()+"개");
		System.out.println("다리는 "+new Bear().getLeg()+"개");
		System.out.println(new Bear().woong);
		
		
		System.out.println("--------사자--------");
		System.out.println("눈은 "+new Lion().getEye()+"개");
		System.out.println("다리는 "+new Bear().getLeg()+"개");
		System.out.println(new Lion().galgi);
		
		System.out.println("--------거미--------");
		Spider s = new Spider();
		System.out.println("눈은 "+s.getEye()+"개");
		System.out.println("다리는 "+s.getLeg()+"개");
		System.out.println(s.web);
		
		
	}

}
