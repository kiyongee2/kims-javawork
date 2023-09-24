package objectarray.book;

public class BookArrayTest {

	public static void main(String[] args) {
		/*Book[] library = new Book[3];
		
		library[0] = new Book("이것이 자바다", "신용권");
		library[1] = new Book("자바프로그래밍 입문", "박은종");
		library[2] = new Book("스프링부트", "채규태");*/
		
		Book[] library = {
			new Book("이것이 자바다", "신용권"),
			new Book("자바프로그래밍 입문", "박은종"),
			new Book("스프링부트", "채규태")
		};
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	}
}
