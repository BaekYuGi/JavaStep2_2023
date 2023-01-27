package Chapter17.TreeSet;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member3 memeber1 = new Member3(1003, "백유기");
		Member3 memeber2 = new Member3(1001, "박범준");
		Member3 memeber3 = new Member3(1005, "정세나");
		Member3 memeber4 = new Member3(1004, "김창우");
		Member3 memeber5 = new Member3(1006, "박수연");
		Member3 memeber6 = new Member3(1002, "김우태");
		
		memberTreeSet.addMember(memeber6);
		memberTreeSet.addMember(memeber3);
		memberTreeSet.addMember(memeber5);
		memberTreeSet.addMember(memeber2);
		memberTreeSet.addMember(memeber1);
		memberTreeSet.addMember(memeber4);
		
		memberTreeSet.showAllMember();
		
	}

}
