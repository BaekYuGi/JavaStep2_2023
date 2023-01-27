package Chapter17.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p = null;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {

			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종료");
			System.out.print("항목선택 : ");

			Scanner s = new Scanner(System.in);
			select = s.nextInt();
			// if switch

			switch (select) {
			case 1:
				p = new Person();
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(s.next());
				System.out.print("나이 : ");
				p.setAge(s.nextInt());
				System.out.print("전화번호 : ");
				p.setTel(s.next());
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				break;
			case 2:
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 이름을 입력하세요 : ");
				String c = s.next();
				for (int i = 0; i < personArr.size(); i++) {
					if (personArr.get(i).getName().equals(c)) {
						personArr.remove(i);
					}
				}
				System.out.println("삭제되었습니다");
				break;
			case 3:
				System.out.println("등록 인원수 : "+personArr.size());
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println(personArr.get(i).getName());
					System.out.println(personArr.get(i).getAge());
					System.out.println(personArr.get(i).getTel());
					System.out.println("--------------");
				}
				break;
			case 4: {
				System.out.println("종료합니다");
				return;
			}

			}

		}

	}
}
