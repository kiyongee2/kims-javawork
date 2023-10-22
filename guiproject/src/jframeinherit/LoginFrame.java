package jframeinherit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
	public LoginFrame() {
		//프레임
		setTitle("로그인");
		setSize(300, 200);
		setLayout(null);
		
		//레이블
		JLabel lbl1 = new JLabel("아이디: ");
		lbl1.setSize(80, 30);
		lbl1.setLocation(30, 30);
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		add(lbl1);  //패널에 추가
		
		//입력상자
		JTextField txt1 = new JTextField();
		txt1.setSize(130, 30);
		txt1.setLocation(110, 30);
		add(txt1);
		
		//레이블
		JLabel lbl2 = new JLabel("비밀번호: ");
		lbl2.setSize(80, 30);
		lbl2.setLocation(30, 70);
		lbl2.setHorizontalAlignment(JLabel.CENTER);
		add(lbl2);
		
		//입력상자
		JTextField txt2 = new JTextField();
		txt2.setSize(130, 30);
		txt2.setLocation(110, 70);
		add(txt2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
	}

}
