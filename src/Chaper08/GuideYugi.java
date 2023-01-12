package Chaper08;

import java.util.Scanner;

public class GuideYugi {

	static String point;
	GuestYugi[] guest;
	Scanner s = new Scanner(System.in);

	
	public GuideYugi() {
		
	}
	// 생성자 초기화
	public GuideYugi(int n) {
		point = "발리";
		guest = new GuestYugi[n];


		// 객체 생성
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new GuestYugi();
			System.out.print((i+1)+". 이름 : ");
			guest[i].setName(s.next());
			System.out.print((i+1)+". 성별 : ");
			guest[i].setGender(s.next());
		}

	}

	public void GuestInfo() {
		for (int i = 0; i < guest.length; i++) {
			System.out.println((i + 1) + ". 이름 : " + guest[i].getName());
			System.out.println((i + 1) + ". 성별 : " + guest[i].getGender());
			System.out.println((i + 1) + ". 목적지 : " + guest[i].getPoint());
			System.out.println("--------------------------");
		}
	}

	public void Dest() {
		System.out.print("어디로 변경하시겠습니까 : ");
		point = s.next();
		System.out.println(point + "로 목적지 변경");
	}

	public void Tour() {
		boolean b = true;
		System.out.print("관광객 수 : ");
		int a = s.nextInt();
		int c = 0;
		GuideYugi g = new GuideYugi(a);
		while (b) {
			System.out.print("1. 관광객 정보 ");
			System.out.print(" 2. 목적지 변경 ");
			System.out.println(" 3. 종료 ");
			System.out.print("선택>>>");
			c = s.nextInt();
			switch (c) {
			case 1:
				g.GuestInfo();
				break;
			case 2:
				g.Dest();
				break;
			case 3:
				System.out.println("프로그램 종료");
				b = false;
				break;
			}
		}

	}

}
