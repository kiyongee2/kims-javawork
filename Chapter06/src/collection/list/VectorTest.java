package collection.list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector 자료 구조 생성
		Vector<String> vegeList = new Vector<>();
		
		//객체 저장
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//특정 위치에 추가
		vegeList.add(2, "상추");
		
		//특정 객체 조회
		System.out.println(vegeList.get(1));
		
		//전체 객체 조회(리스트 형태로 출력)
		System.out.println(vegeList);
		
		//객체 삭제
		//vegeList.remove("고추");  
		
		if(vegeList.contains("마늘")) { //객체가 있는지 확인해야 안전함
			vegeList.remove("마늘");
		}
		
		//전체 출력1
		for(int i = 0; i < vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		System.out.println("===============");
		
		//객체 수정
		vegeList.set(2, "깻잎");
		
		//전체 출력2
		for(String vege : vegeList)
			System.out.println(vege);
	}
}
