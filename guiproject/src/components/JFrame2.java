package components;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame2 {

	public static void main(String[] args) {
		//JLabel을 원하는 위치에 설정하기
		JFrame frame = new JFrame();
		frame.setTitle("윈도우 프로그래밍");
		frame.setSize(300, 200);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		//frame.setBounds(100, 100, 300, 200);  //x, y, width, height
		frame.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("안녕~ Swing");
		label.setSize(100, 30);
		label.setLocation(40, 40);
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

}
