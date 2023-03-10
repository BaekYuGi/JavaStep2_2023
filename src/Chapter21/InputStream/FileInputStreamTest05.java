package Chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("resource.txt",true);
				FileInputStream fis = new FileInputStream("resource.txt")) {
			//쓰기
			fos.write(65);//A 대응되는 문자로 저장
			fos.write(66);//B 대응되는 문자로 저장
			fos.write(67);//C 대응되는 문자로 저장
			fos.write(68);//C 대응되는 문자로 저장
			fos.write(69);//C 대응되는 문자로 저장
			//읽기
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
