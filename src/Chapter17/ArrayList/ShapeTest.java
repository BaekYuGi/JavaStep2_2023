package Chapter17.ArrayList;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw Shape");
	}

	public void testCasting() {
		// TODO Auto-generated method stub
		
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Circle");
	}

	void circle() {
		System.out.println("원모양 입니다.");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}

	void Rectangle() {
		System.out.println("사각형 모양 입니다.");
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}

	void Triangle() {
		System.out.println("삼각형 모양 입니다.");
	}

}

public class ShapeTest {

	// shape와 shape를 상속받은 모든 클래스 타입이 사용하는 ArrayList
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {

		ShapeTest sTest = new ShapeTest();
		System.out.println("----업캐스팅----");
		sTest.addShape();

	}

	public void addShape() {

		sList.add(new Circle());
		sList.add(new Rectangle());
		sList.add(new Triangle());

		for (Shape s : sList) {
			s.draw();
			
		}
		System.out.println("----다운캐스팅----");
	
			testCasting();	
		
		

	}

	public void testCasting() {

		for (int i = 0; i < sList.size(); i++) {
			Shape s = sList.get(i); // 일단 부모(Shape)타입으로 가져옴

			if (s instanceof Circle) {
				Circle c = (Circle) s;// 다운캐스팅
				c.circle();
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;
				r.Rectangle();
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				t.Triangle();
			}
			

		}

	}

}
