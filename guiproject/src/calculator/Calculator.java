package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	
	public Calculator() {
		setTitle("덧셈 프로그램");
		setSize(300, 120);     
		setLocation(100, 100);
		
		//패널 2개 생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		add(pane1, BorderLayout.NORTH);
		add(pane2, BorderLayout.CENTER);
		
		//패널 배치
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		//연산자
		String[] operator = {"+", "-", "*", "/"};
		JComboBox<String> comboBox = new JComboBox<>(operator);
	
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		JLabel label = new JLabel();
		
		pane2.setLayout(new FlowLayout());
		JButton confirmBtn = new JButton("확인");
		JButton cancelBtn = new JButton("취소");
		
		//pane에 컴포넌트 올리기
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);
		
		pane2.add(confirmBtn);
		pane2.add(cancelBtn);
		
		//계산하기
		//확인
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				String op = (String)comboBox.getSelectedItem();
				int num2 = Integer.parseInt(text2.getText());

				switch(op) {
				case "+":
					int result = num1 + num2; 
					text3.setText(String.valueOf(result)); break;
				case "-":
					result = num1 - num2; 
					text3.setText(String.valueOf(result)); break;
				case "*":
					result = num1 * num2;
					text3.setText(String.valueOf(result)); break;
				case "/":
					double result2 = (double)num1 / num2;
					text3.setText(String.valueOf(result2)); break;
				}	
			}
		};
		confirmBtn.addActionListener(listener);
		
		//취소
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
			}
		};
		cancelBtn.addActionListener(listener2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
