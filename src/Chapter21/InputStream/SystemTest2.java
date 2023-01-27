package Chapter21.InputStream;

import java.io.IOException;
import java.util.Scanner;

public class SystemTest2 {
	
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			while((i=System.in.read())!='\n') {
				System.out.print((char) i+" ");
				System.out.print(i+" ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
