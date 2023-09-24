package objectarray.dog;

public class DogTest2 {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[4];
		
		dogs[0] = new Dog();
		dogs[1] = new Dog();
		dogs[2] = new Dog();
		dogs[3] = new Dog();
		
		dogs[0].setName("백구1");
		dogs[0].setType("진돗개");
		dogs[1].setName("백구2");
		dogs[1].setType("치와와");
		dogs[2].setName("백구3");
		dogs[2].setType("시츄");
		dogs[3].setName("백구4");
		dogs[3].setType("불독");
		
		//System.out.println(dog[0].showDogInfo());
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
	}

}
