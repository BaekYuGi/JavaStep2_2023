package Chapter21.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws IOException {
		/*
		try(FileInputStream fis=new FileInputStream("Input.txt")) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO: handle exception
		}
		*/
		FileInputStream fis = null;
		
		try{
			fis=new FileInputStream("Input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end");
		}
		
	}

}
