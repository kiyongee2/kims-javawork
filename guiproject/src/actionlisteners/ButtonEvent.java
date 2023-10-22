package actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class ShowMessageActionListener implements ActionListener{
	
	public void showMessage() {
		JFrame frame = new JFrame();
		frame.setTitle("윈도우 프로그래밍");
		frame.setSize(300, 300);      //width, height
		frame.setLocation(100, 100);  //x, y 좌표
		//frame.setBounds(100, 100, 300, 200);  //x, y, width, height
		frame.setLayout(null);
		
		String[] btnName = {"1번", "2번", "3번"};
		
		for(int i=0; i<btnName.length; i++) {
			JButton btn = new JButton(btnName[i]);
			btn.setSize(80, 40);
			btn.setLocation(100, 40 + 60*i);
			btn.addActionListener(this);
			
			frame.add(btn);
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "이벤트 발생\n클릭한 버튼의 번호는 "
				+ e.getActionCommand() + "입니다.");
	}
	
}

public class ButtonEvent {

	public static void main(String[] args) {
		ShowMessageActionListener listener = new ShowMessageActionListener();
		listener.showMessage();
	}

}
