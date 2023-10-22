package components;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {

	public static void main(String[] args) {
		//JFrame frame = new JFrame("윈도우 프로그래밍");
		JFrame frame = new JFrame();
		frame.setTitle("윈도우 프로그래밍");
		frame.setSize(300, 200);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		//frame.setBounds(100, 100, 300, 200);  //x, y, width, height
		
		JLabel label = new JLabel("안녕~ Swing");
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
