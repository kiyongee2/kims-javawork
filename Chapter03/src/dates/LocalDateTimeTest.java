package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		//현재 날짜와 시간 객체 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜와 시간 포맷 설정
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(dateTime));
		
		//특정 날짜 지정하기
		LocalDate theDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		System.out.println(theDay);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(theDay, today);
		System.out.println(passedTime + "일 지났습니다.");
	}
}
