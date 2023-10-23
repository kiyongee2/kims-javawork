package exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JTextField text;
	
	public MyFrame() {
		this.setLayout(new FlowLayout());
		
		text = new JTextField();
		text.setPreferredSize(new Dimension(200, 40));
		text.setFont(new Font("돋움", Font.PLAIN, 30));
		text.setForeground(new Color(0xffffff));
		text.setBackground(Color.blue);
		//text.setText("username");
		
		button = new JButton("Submit");
		
		this.add(text);
		this.add(button);
		
		//이벤트 실행
		button.addActionListener(this);
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String msg = text.getText();
			System.out.println("Welcome " + msg);
			//button.setEnabled(false);  //한 번만 사용
			//text.setEditable(false);   //편집할 수 없음
		}
	}
}
