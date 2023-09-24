package objectarray.dog;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[4];
		
		dogs[0] = new Dog("백구1", "진돗개");
		dogs[1] = new Dog("백구2", "진돗개");
		dogs[2] = new Dog("백구3", "진돗개");
		dogs[3] = new Dog("백구4", "진돗개");
		
		//System.out.println(dog[0].showDogInfo());
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
	}
}
