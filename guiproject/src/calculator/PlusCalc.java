package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusCalc {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("덧셈 프로그램");
		frame.setSize(300, 120);     
		frame.setLocation(100, 100);
		
		//패널 2개 생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		frame.add(pane1, BorderLayout.NORTH);
		frame.add(pane2, BorderLayout.CENTER);
		
		//패널 배치
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		pane2.setLayout(new FlowLayout());
		JButton confirmBtn = new JButton("확인");
		JButton cancelBtn = new JButton("취소");
		
		//pane에 컴포넌트 올리기
		pane1.add(text1);
		pane1.add(new JLabel("+"));
		pane1.add(text2);
		pane1.add(new JLabel("="));
		pane1.add(text3);
		
		pane2.add(confirmBtn);
		pane2.add(cancelBtn);
		
		//계산하기
		//확인
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				int sum = num1 + num2;
				text3.setText(String.valueOf(sum));
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
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
