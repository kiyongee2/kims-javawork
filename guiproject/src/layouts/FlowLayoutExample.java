package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("FlowLayout");
		frame.setSize(500, 100);      
		frame.setLocation(100, 100);  
		
		FlowLayout flowLayout = new FlowLayout();
		frame.setLayout(flowLayout);
		
		//컴포넌트 배치
		frame.add(new JButton("계란"));  
		frame.add(new JButton("커피"));  
		frame.add(new JButton("두부")); 
		frame.add(new JButton("콩나물")); 
		frame.add(new JButton("쌀")); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
