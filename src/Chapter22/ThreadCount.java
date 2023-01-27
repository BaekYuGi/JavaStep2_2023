package Chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("값을 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		Thread t = new Thread(tc);
		t.start();
		
		
	}

	@Override
	public void run() {
		for(int i = n;i>=0;i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("프로그램 종료");
	}

}
