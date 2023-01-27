package Chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args){
		/*
		try(FileInputStream fis=new FileInputStream("Input.txt")) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO: handle exception
		}
		*/
		//한글 깨짐
//		FileInputStream fis = null;
		FileReader fis = null;
		try{
			fis=new FileReader("Input.txt");
			int i;
//			fis.read(); : 파일을 끝까지 읽으면 -1을 반환
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//NullPointerException을 잡지 못해서 죽음
				//catch 
			}catch (NullPointerException e) {
				System.out.println(e);
			}
			
		}
			System.out.println();
			System.out.println("end");
	}

}
