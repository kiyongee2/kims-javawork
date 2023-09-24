package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "강감찬"));
		memberMap.addMember(new Member(1003, "홍길동"));
		
		memberMap.removeMember(1004);
		
		memberMap.showAllMember();
		
	}

}
