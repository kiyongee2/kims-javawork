package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	//필드
	private Map<Integer, Member> hashMap;
	
	//생성자
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록 조회
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			Integer key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	/*public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}*/
	
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}else {
			System.out.println(memberId + "가 존재하지 않습니다.");
		}
	}
}
