package jframextends;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
	public LoginFrame() {
		setTitle("Login");
		setSize(300, 250);
		setLocation(100, 100);
		setLayout(null);
		
		JLabel lbl1 = new JLabel("로그인");
		lbl1.setSize(80, 30);
		lbl1.setLocation(40, 40);
		add(lbl1);
		
		JTextField txt1 = new JTextField();
		txt1.setSize(120, 30);
		txt1.setLocation(100, 40);
		add(txt1);
		
		JLabel lbl2 = new JLabel("비밀번호");
		lbl2.setSize(100, 30);
		lbl2.setLocation(40, 80);
		add(lbl2);
		
		JTextField txt2 = new JTextField();
		txt2.setSize(120, 30);
		txt2.setLocation(100, 80);
		add(txt2);
		
		//로그인 버튼
		JButton btn = new JButton("로그인");
		btn.setSize(80, 30);
		btn.setLocation(90, 130);
		add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
	}

}
