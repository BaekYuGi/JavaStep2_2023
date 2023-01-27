package Chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X,Y MyInterface 클래스 타입의 변수를 선언하여 출력
		
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.X();
		System.out.println("---------------");
		
		Y yClass = mClass;
		yClass.Y();
		System.out.println("---------------");
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.X();
		iClass.Y();
		
	}

}
