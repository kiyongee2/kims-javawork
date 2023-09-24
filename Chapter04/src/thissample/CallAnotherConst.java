package thissample;

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person person = noName.returnItself();
		
		System.out.println(noName);
		System.out.println(person);
	}

}
