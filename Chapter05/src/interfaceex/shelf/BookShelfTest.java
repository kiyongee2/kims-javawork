package interfaceex.shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		
		//책 추가
		shelfQueue.enQueue("미생1");
		shelfQueue.enQueue("아리랑1");
		
		//책 권수
		System.out.println("현재 리스트의 개수: " + shelfQueue.getSize());
		
		//책 출력 - FILO(First In Last Out)
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());

	}

}
