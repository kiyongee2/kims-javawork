package polymorphism.downcasting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 멀리 날아갑니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이 움직입니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 먹이를 사냥합니다.");
	}
}


public class AnimalTest {
	
	private static ArrayList<Animal> animalList = new ArrayList<>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		animalList.add(human);
		animalList.add(eagle);
		animalList.add(tiger);
		
		for(Animal animal : animalList)
			animal.move();
		System.out.println("*** 원래형으로 다운캐스팅 ***");
		aTest.testCasting();  //downcasting 호출
		
	}
	
	private void testCasting() {
		//Animal animal = animalList.get(0);
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else {
				System.out.println("지원하지 않은 형입니다.");
			}
		}
	}

}
