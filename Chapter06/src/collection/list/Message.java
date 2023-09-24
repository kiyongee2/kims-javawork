package collection.list;

public class Message {
	String command;  //수행, 방법
	String to;       //대상
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
