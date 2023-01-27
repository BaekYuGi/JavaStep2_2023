package Chapter16.generic1;

public class GenMain {
	
	public static void main(String[] args) {
		
		
		Gen gen = new Gen();
		
		//정수형
		Integer[] iArr= {1,2,3,4,5};
		Double[] dArr= {1.3,2.5,4.3,5.6,7.2};
		Character[] cArr= {'a','b','c','d','e'};
		
		gen.printArr(iArr);

		gen.printArr(dArr);

		gen.printArr(cArr);
	}
	
}
