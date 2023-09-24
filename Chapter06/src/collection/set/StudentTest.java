package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);
 	}

}
