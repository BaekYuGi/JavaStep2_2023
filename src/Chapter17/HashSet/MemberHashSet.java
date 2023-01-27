package Chapter17.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashset;

	//생성자를 통한 LinkedList객체 생성
	public MemberHashSet(){
	hashset = new HashSet<Member2>();
	}
	
	//addMember
	public void addMember(Member2 member) {
		hashset.add(member);

	}
	//removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member2> ir =hashset.iterator();
		while(ir.hasNext()) {
			Member2 member =ir.next();
			int tempId=member.getMemberId();
			if(tempId== memberId) {
				hashset.remove(memberId);
			return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	//showAllMembe
	public void showAllMember() {
		for(Member2 member : hashset) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
