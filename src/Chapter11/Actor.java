package Chapter11;

import java.util.Scanner;

public class Actor {
	public static void main(String[] args) {
		String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" }, { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
				{ "[이병헌]", "지아이조", "레드", "광해" } };
		int cnt = 0;

		System.out.println("검색할 배우 : ");
		Scanner scan = new Scanner(System.in);
		String actName = "[" + scan.next() + "]";

		for (int i = 0; i < actor.length; i++) {
			if (actName.equals(actor[i][0])) {
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			} 
			else {
				cnt++;
		

			}
			
		}		if(cnt>=actor.length) {
			System.out.println("해당배우가 없습니다");
		}
			}

}
