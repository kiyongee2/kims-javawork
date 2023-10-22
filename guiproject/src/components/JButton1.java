package components;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {

	public static void main(String[] args) {
		//JLabel을 원하는 위치에 설정하기
		JFrame frame = new JFrame();
		frame.setTitle("윈도우 프로그래밍");
		frame.setSize(300, 300);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		//frame.setBounds(100, 100, 300, 200);  //x, y, width, height
		frame.setLayout(null);
		
		String[] btnName = {"1번", "2번", "3번"};
		
		for(int i=0; i<btnName.length; i++) {
			JButton btn = new JButton(btnName[i]);
			btn.setSize(80, 40);
			btn.setLocation(100, 40 + 60*i);
			frame.add(btn);
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

}
