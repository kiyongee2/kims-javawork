package kr.or.iei.run;

import kr.or.iei.model.vo.User;

public class Start2 {

	public static void main(String[] args) {
		// toString()으로 출력하기
		//User user1 = new User("user01", "pass01", "유저1", 23, "01011112222");
		//System.out.println(user1);
		
		User[] users = new User[3];
		
		User user1 = new User("user01", "pass01", "유저1", 23, "01011112222");
		User user2 = new User("user02", "pass02", "유저2", 27, "01022223333");
		User user3 = new User("user03", "pass03", "유저3", 34, "01033334444");

		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]);
		}
	}
}
