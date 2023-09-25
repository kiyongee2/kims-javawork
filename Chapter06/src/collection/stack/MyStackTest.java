package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push("말");
		myStack.push("돼지");
		myStack.push("닭");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
