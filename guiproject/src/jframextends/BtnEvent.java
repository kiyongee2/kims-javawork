package jframextends;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BtnEvent extends JFrame{
	
	public BtnEvent() {
		setTitle("버튼 이벤트");
		setSize(250, 100); 
		setLocation(100, 100);
		
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
		/*add(txt, "Center");  //중앙
		add(btn, "East");    //동쪽
		add(lbl, "South");   //남쪽*/
		add(txt, BorderLayout.CENTER);
		add(btn, BorderLayout.EAST);
		add(lbl, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BtnEvent();
	}

}
