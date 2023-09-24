package switchexample;

public class MedalColor {

	public static void main(String[] args) {
		
		String medalColor = "GOLD";
		
		switch(medalColor) {
		case "GOLD": 
			System.out.println("금메달 입니다.");
			break;
		case "SILVER": 
			System.out.println("은메달 입니다.");
			break;
		case "BRONZE": 
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;	
		}
		System.out.println(medalColor);
	}

}
