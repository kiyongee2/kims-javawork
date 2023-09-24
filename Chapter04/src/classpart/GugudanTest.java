package classpart;

class Gugudan{
	
	public void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
	}
	
}

public class GugudanTest {

	public static void main(String[] args) {
		Gugudan gugu = new Gugudan();
			gugu.gugudan(3);
	}

}
