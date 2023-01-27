package Chapter18.TreeMap;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		
		MemberTreeMap MemberTreeMap =new MemberTreeMap();
		
		//가방에 넣을 Member 데이터
		Member3 memberLee=new Member3(1003, "이지원");
		Member3 memberSon=new Member3(1002, "손민국");
		Member3 memberPark=new Member3(1004, "박서연");
		Member3 memberHong=new Member3(1001, "홍길동");
		
		//가방 넣기
		
		MemberTreeMap.addMember(memberLee);
		MemberTreeMap.addMember(memberSon);
		MemberTreeMap.addMember(memberPark);
		MemberTreeMap.addMember(memberHong);
		
		MemberTreeMap.showAllMember();
		
	}

}
