package Chapter21.InputStream;

import java.io.IOException;
import java.util.Scanner;

public class SystemTest1 {
	
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		try {
			int i=System.in.read();
			System.out.println(i); //아스키 코드
			System.out.println((char) i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
