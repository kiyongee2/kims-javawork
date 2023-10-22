package jframextends;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyButton extends JFrame{
	
	public MyButton() {
		setTitle("Hello");
		setSize(300, 200);
		//setLayout(null);
		JLabel lbl1 = new JLabel("안녕~ Swing");
		//lbl1.setSize(80, 30);
		//lbl1.setLocation(30, 30);
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		
		add(lbl1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyButton frame = new MyButton();
	}

}
