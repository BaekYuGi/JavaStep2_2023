package Chapter21.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest02 {

	public static void main(String[] args) throws IOException {
		
	
		try(FileReader fr = new FileReader("reader.txt")) {
			int i;
			
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
