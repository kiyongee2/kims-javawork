package dates;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//날짜
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		//시간
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);  //1-일요일 6-토
		
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(days[day-1]);
		
		//지나온 시간
		Calendar theDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		theDay.set(2023, 9, 1);
		today.set(2023, 9, 14);
		
		long passedTime = today.getTimeInMillis() - theDay.getTimeInMillis();
		System.out.println(passedTime);
		//초를 일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime);
	}
}
