package Chaper08;

import java.util.Scanner;

public class TourYugi {

	public static void main(String[] args) {
		/*
		GuideYugi g = new GuideYugi();
		g.Tour();
		
		*/

		outer:while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("관광객 수 : ");
		int n  = scan.nextInt();
		
		GuideYugi guide = new GuideYugi(n);
		
		System.out.println("관광객 등록");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+". 이름 : ");
			guide.guest[i].setName(scan.next());
			System.out.print((i+1)+". 성별 : ");
			guide.guest[i].setGender(scan.next());
		}
		
		int select = scan.nextInt();
			switch (select) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+". 이름 : "+guide.guest[i].getName());
					System.out.println((i+1)+". 성별 : "+guide.guest[i].getGender());
					System.out.println((i+1)+". 목적지 : "+guide.guest[i].getPoint());
				}
				break;
			case 2:
				System.out.println("어디로 변경하시겠습니까? ");
				GuideYugi.point = scan.next();
				System.out.println(GuideYugi.point+"로 목적지 변경");
			break;
			case 3:
			System.out.println("종료");
			
				break outer;
			}
		}
	}
}
