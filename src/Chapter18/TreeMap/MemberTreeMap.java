package Chapter18.TreeMap;


import java.util.Iterator;
import java.util.TreeMap;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.Member3;

public class MemberTreeMap {

	private TreeMap<Integer, String> treeMap;

	public MemberTreeMap() {

		treeMap = new TreeMap<Integer, String>();

	}

	public void addMember(Member3 member) {
		treeMap.put(member.getMemberId(), member.getMemberName());
	}
	
	public void removeMember(Member member) {
		
	}

	public boolean removeMember(int memberId) {
		while(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
			}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
		}
		
	

	//showAllMembe
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key=ir.next();
			String member=treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
