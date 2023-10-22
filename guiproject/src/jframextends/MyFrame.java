package jframextends;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	public MyFrame() { //생성자
		setTitle("Hello");
		setSize(300, 200);
		setLocation(100, 100);
		setLayout(null);
		
		//레이블 생성
		JLabel lbl = new JLabel("안녕~ Swing");
		lbl.setSize(80, 30);
		lbl.setLocation(40, 40);
		add(lbl);
		
		//버튼 생성
		JButton btn = new JButton("확인");
		btn.setSize(60, 30);
		btn.setLocation(100, 80);
		add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료
		setVisible(true); //화면 출력
	}

	public static void main(String[] args) {
		//객체 생성시 윈도우 생성
		//MyFrame frame = new MyFrame(); 
		new MyFrame(); 
	}
}
