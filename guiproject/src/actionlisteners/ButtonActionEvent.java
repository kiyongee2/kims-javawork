package actionlisteners;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("버튼 이벤트");
		frame.setSize(250, 100);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		
		JTextField txt = new JTextField();
		JButton btn = new JButton("확인");
		JLabel lbl = new JLabel("Hello");
		
		//button 이벤트 - ConfirmBtnActionListener 클래스 호출
		ConfirmBtnActionListener listener = 
				new ConfirmBtnActionListener(txt, lbl);
		btn.addActionListener(listener);
		
		//컴포넌트 배치 - BorderLayout.CENTER은 "Center"와 같음
		frame.add(txt, "Center");  //중앙
		frame.add(btn, "East");    //동쪽
		frame.add(lbl, "South");   //남쪽
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
