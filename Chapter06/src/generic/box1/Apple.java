package generic.box1;

public class Apple {
	String name;
	
	Apple(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + "]";
	}
}
