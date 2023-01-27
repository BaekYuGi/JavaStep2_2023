package Chapter17.TreeSet;

import java.util.TreeSet;

public class Member3 implements Comparable<Member3>{
	
	private int memberId;
	private String memberName;
	
	 public Member3() {
		
	}
	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	
	
	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;

	}


	
	//물리적인 값

	@Override
	public int hashCode() {
		
//		memberName.hashCode() : String이므로 10진수
//		return super.hashCode(); 10진수 메모리 주소
		//방법1
	      //return super.hashCode() + memberId;
	      //방법2
	       return memberId;
	}

/*
	//논리적인 값
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return member.memberName.equals(memberName)&&(member.memberId==memberId);
		}else {
			return false;
		}
	}

*/
	
	
	@Override
	public String toString() {
		return memberName+"회원님의 아이디는 "+memberId+"입니다";
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member=(Member3)obj;
			if(this.memberId==member.memberId) {
				return true;
			}
		}
		return false;
	}



	@Override
	public int compareTo(Member3 member) {
		return (this.memberId-member.memberId)*-1;
	}

	
	
	
	
}
