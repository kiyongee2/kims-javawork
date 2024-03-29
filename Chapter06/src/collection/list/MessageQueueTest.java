package collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "양파"));
		messageQueue.offer(new Message("sendSMS", "마늘"));
		messageQueue.offer(new Message("sendKatalk", "감자"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendKatalk":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}
		}
		
	}

}
