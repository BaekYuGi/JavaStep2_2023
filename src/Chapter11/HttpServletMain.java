package Chapter11;

import java.util.Scanner;

public class HttpServletMain {

	public static void main(String[] args) {
		method(new LoginService());
		method(new FileDownloadService());
		
	}
	
	//메소드명 method(static)
	public static void method(HttpServlet httpServlet) {
		httpServlet.service();
	}
	
	
}
