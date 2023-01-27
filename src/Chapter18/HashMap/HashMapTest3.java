package Chapter18.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest3 {
	//HashTable : 동기화
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id= s.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pw = s.next();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치 하지 않습니다");
					continue;
				}
				
			}else {
				System.out.println("입력하신 아이디가 없습니다");
			}
		}
		
		
	}

}
