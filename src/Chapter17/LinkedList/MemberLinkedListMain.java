package Chapter17.LinkedList;

import Chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		//순서 O 중복 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		Member member1 = new Member(1001,"김창우");
		Member member2 = new Member(1002,"박범준");
		Member member3 = new Member(1003,"정세나");
		Member member4 = new Member(1004,"백유기");
		Member member5 = new Member(1005,"박수연");
		
		
		memberLinkedList.addMember(member1);
		memberLinkedList.addMember(member2);
		memberLinkedList.addMember(member3);
		memberLinkedList.addMember(member4);
		memberLinkedList.addMember(member5);
		
		
		memberLinkedList.showAllMember();
		
		Member member6 = new Member(1006,"김우태");
		
		memberLinkedList.addMember(member6);
		
		memberLinkedList.showAllMember();
		
		
	}

}
