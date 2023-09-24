package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println("==============");
		
		//부모형으로 객체 생성(다형성)
		Animal dog2 = new Dog();
		dog2.sound();
		
		Animal cat2 = new Cat();
		cat2.sound();
		
		//메서드의 매개변수 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
