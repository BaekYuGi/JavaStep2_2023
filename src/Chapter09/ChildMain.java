package Chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
		
		
	}

}
