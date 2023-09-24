package polymorphism.animal;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이 움직입니다.");
	}
}


public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);
	}

}
