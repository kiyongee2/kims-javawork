package layouts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BorderLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("BorderLayout");
		frame.setSize(250, 110);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		
		JTextField txt = new JTextField("BorderLayout 예제");
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("삭제");
		
		//컴포넌트 배치
		frame.add(txt, BorderLayout.NORTH);  //북쪽
		frame.add(btn1, BorderLayout.CENTER);  //동쪽
		frame.add(btn2, BorderLayout.SOUTH); //남쪽
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
