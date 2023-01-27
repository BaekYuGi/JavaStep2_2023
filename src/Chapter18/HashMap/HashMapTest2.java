package Chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

		// Map<String Integer>생성map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 팀원 데이터(성함,학번)저장

		map.put("김창우", 1001);
		map.put("박수연", 1005);
		map.put("백유기", 1002);
		map.put("박범준", 1003);
		map.put("정세나", 1006);
		map.put("김우태", 1004);

		// 팀원의 인원
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("==========");
		// 팀장의 학번을 알아내자
		System.out.println("팀장의 학번 : " + map.get("김창우"));
		System.out.println("==========");
		// 팀원 모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		System.out.println("팀원 학번");
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}

	}

}
