package objectarray.book;

public class DeepCopy {

	public static void main(String[] args) {
		// 객체 배열의 깊은 복사
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//array1 객체 생성
		array1[0] = new Book("이것이 자바다", "신용권");
		array1[1] = new Book("자바프로그래밍 입문", "박은종");
		array1[2] = new Book("스프링부트", "채규태");
		
		//array2 객체 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//array1 요소를 array2에 복사
		for(int i=0; i<array1.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		//array1의 첫째값 수정
		array1[0].setBookName("웹 표준의 정석");
		array1[0].setAuthor("고경희");
		
		for(Book book : array1)
			book.showBookInfo();
		
		System.out.println("------------------------");
		
		for(Book book : array2)
			book.showBookInfo();

	}

}
