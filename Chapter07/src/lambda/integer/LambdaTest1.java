package lambda.integer;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		/*MyClass mClass = new MyClass();
		mClass.method();*/
	
		MyFuncInterface fi = null;
		
		fi = () -> System.out.println("Hello");
		fi.method();
	}

}
