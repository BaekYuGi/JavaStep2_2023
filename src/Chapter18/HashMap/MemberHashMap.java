package Chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import Chapter17.Member;
import Chapter17.Member2;

public class MemberHashMap {

	private HashMap<Integer, String> hashMap;

	public MemberHashMap() {

		hashMap = new HashMap<Integer, String>();

	}

	public void addMember(Member2 memberLee) {
		hashMap.put(memberLee.getMemberId(), memberLee.getMemberName());
	}
	
	public void removeMember(Member member) {
		
	}

	public boolean removeMember(int memberId) {
		while(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
			}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
		}
		
	

	//showAllMembe
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key=ir.next();
			String member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
