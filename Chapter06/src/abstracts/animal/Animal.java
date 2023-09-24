package abstracts.animal;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	public abstract void sound();
}
