package Chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis= null;
		//try catch 사용
		try {//open
			fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {//close
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finally");
		}
		System.out.println("end");
		
	}

}
