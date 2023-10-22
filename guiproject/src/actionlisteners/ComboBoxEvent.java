package actionlisteners;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEvent extends JFrame{
	
	String[] money = {"달러", "위안", "유로", "엔"};
	JComboBox<String> comboBox;
	JLabel label;
	
	public ComboBoxEvent() {
		setTitle("목록 메뉴");
		setSize(300, 150); 
		setLocation(100, 100);
		
		//컴포넌트 객체 생성
		comboBox = new JComboBox<>(money);
		label = new JLabel();
		
		//배치
		add(comboBox, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		
		//메뉴 선택 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String money = (String)comboBox.getSelectedItem();
				label.setText(money + "를 선택하셨습니다.");
			}
		};
		comboBox.addActionListener(listener);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEvent();
	}

}
