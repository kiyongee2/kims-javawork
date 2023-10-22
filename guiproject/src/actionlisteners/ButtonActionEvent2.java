package actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent2 extends JFrame{
	
	public ButtonActionEvent2() {
		setTitle("버튼 이벤트");
		setSize(250, 100);      //width, height
		setLocation(100, 100);  //x, y 좌표
		
		JTextField txt = new JTextField();
		JButton btn = new JButton("확인");
		JLabel lbl = new JLabel("Hello");
		
		//button 이벤트 - 익명 객체로 구현
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txt.getText();
				lbl.setText("Hello~ " + name);
			}
		};
		btn.addActionListener(listener);
		
		//컴포넌트 배치
		add(txt, "Center");  //중앙
		add(btn, "East");    //동쪽
		add(lbl, "South");   //남쪽
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonActionEvent2();
	}
}
