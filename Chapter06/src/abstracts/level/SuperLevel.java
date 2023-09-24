package abstracts.level;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빨리 달림");
		
	}

	@Override
	public void jump() {
		System.out.println("매우 높히 점프함");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 턴함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급자 레벨입니다.");
	}

}
