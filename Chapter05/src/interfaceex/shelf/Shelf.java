package interfaceex.shelf;

import java.util.ArrayList;

public class Shelf {
	//문자열을 저장할 리스트 생성
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
}
