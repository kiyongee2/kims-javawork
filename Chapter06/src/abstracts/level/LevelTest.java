package abstracts.level;

public class LevelTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		System.out.println("************************");
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		System.out.println("************************");
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}
	
	

}
