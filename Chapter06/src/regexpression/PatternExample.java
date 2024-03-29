package regexpression;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		//'\' 한개 더 붙여줌- 구분하기 위함
		//전화 번호
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-5678";
		boolean result = Pattern.matches(regExp, phone);
		//System.out.println(result);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//계좌 번호
		String regExp1 = "\\d{2}-\\d{2}-\\d{3}";
		String account = "aa-22-333";
		boolean result1 = Pattern.matches(regExp1, account);
		//System.out.println(result);
		if(result1) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
