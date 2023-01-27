package Chapter17.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Chapter17.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedList;

	//생성자를 통한 LinkedList객체 생성
	public MemberLinkedList(){
	linkedList = new LinkedList<Member>();
	}
	
	//addMember
	public void addMember(Member member) {
		linkedList.add(member);

	}
	//removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member> ir =linkedList.iterator();
		while(ir.hasNext()) {
			Member member =ir.next();
			int tempId=member.getMemberId();
			if(tempId== memberId) {
			linkedList.remove(memberId);
			return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	//showAllMembe
	public void showAllMember() {
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}