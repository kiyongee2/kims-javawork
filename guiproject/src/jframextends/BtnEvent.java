package jframextends;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BtnEvent extends JFrame{
	
	public BtnEvent() {
		this.setTitle("버튼 이벤트");
		this.setLocation(100, 100);
		
		JTextField txt = new JTextField();
		txt.setPreferredSize(new Dimension(200, 40));
		txt.setFont(new Font("맑은고딕", Font.PLAIN, 30));
		txt.setForeground(new Color(0x00ff00));
		txt.setBackground(Color.black);
		
		JButton btn = new JButton("Submit");
		
		JLabel lbl = new JLabel("Hello");
		lbl.setPreferredSize(new Dimension(200, 50));
		lbl.setFont(new Font("돋움", Font.BOLD, 20));
		
		//컴포넌트 배치
		this.add(txt, BorderLayout.CENTER);
		this.add(btn, BorderLayout.EAST);
		this.add(lbl, BorderLayout.SOUTH);
		
		/*add(txt, "Center");  //중앙
		this.add(btn, "East");    //동쪽
		this.add(lbl, "South");   //남쪽*/
		
		//button 이벤트 - 익명 객체로 구현
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txt.getText();   //입력상자의 글 가져옴
				lbl.setText("Hello~ " + name); //레이블에서 설정함
			}
		};
		btn.addActionListener(listener);  //버튼 실행
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BtnEvent();  //객체 생성
	}
}
