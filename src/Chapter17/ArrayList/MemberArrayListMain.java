package Chapter17.ArrayList;

import Chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member member1 = new Member(1001,"김창우");
		Member member2 = new Member(1002,"박범준");
		Member member3 = new Member(1003,"정세나");
		Member member4 = new Member(1004,"백유기");
		Member member5 = new Member(1005,"박수연");
		Member member6 = new Member(1006,"김우태");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.addMember(member5);
		memberArrayList.addMember(member6);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(member3.getMemberId());
		memberArrayList.showAllMember();
	}

}
