package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//member 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//member 목록 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//member 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			//이미 등록된 memberId를 dbId에 저장함
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) { //dbId가 외부 입력한 memberId와 일치하면
				Member member = arrayList.get(i); //해당 객체를 가져와서
				arrayList.remove(member); //해당 객체 삭제
				return true;
			}	
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
}

