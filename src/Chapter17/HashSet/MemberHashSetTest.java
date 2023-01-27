package Chapter17.HashSet;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.LinkedList.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member2 member1 = new Member2(1001,"김창우");
		Member2 member2 = new Member2(1002,"박범준");
		Member2 member3 = new Member2(1003,"정세나");
		Member2 member4 = new Member2(1004,"백유기");
		Member2 member5 = new Member2(1005,"박수연");
		
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.addMember(member4);
		memberHashSet.addMember(member5);
		
		
		memberHashSet.showAllMember();
		//방법1
//		Member2 member6 = new Member2(1005,"백유기");
		//방법 2
		Member2 member6 = new Member2(1004,"백유기");
		
		memberHashSet.addMember(member6);
		
		memberHashSet.showAllMember();
	}

}
