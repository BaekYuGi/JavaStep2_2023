package Chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest04 {

	public static void main(String[] args){
		try(FileInputStream fis = new FileInputStream("Input2.txt")){
			
			byte[] bs = new byte[10];// 버퍼로 활용
			
			int i;
			while((i=fis.read(bs))!=-1) {
				//버퍼읽기 : 10개씩 가베지값 출력
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]+" ");	
				}//10개 출력 완료
				System.out.println(" : "+i+"바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		/*finally {
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
			
		}*/
			System.out.println();
			System.out.println("end");
	}

}
