package Chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcaption2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExcaption2 test = new ThrowsExcaption2();
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
		
	}

}
