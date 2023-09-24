package objectarray.book;

public class BookArrayTest2 {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		//책 객체 생성
		Book book1 = new Book("이것이 자바다", "신용권");
		Book book2 = new Book("자바프로그래밍 입문", "박은종");
		Book book3 = new Book("스프링부트", "채규태");
		
		//인덱스로 1개씩 저장(반복문 안됨)
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].getBookName() + ", " +
						books[i].getAuthor());
		}
	}
}

