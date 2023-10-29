package exchangeconvert;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ExchangeConverter extends JFrame implements ActionListener{

	static final float USD = 1358.00F;
	static final float CNY = 185.19F;
	static final float EUR = 1434.59F;
	static final float JPY = 9.07F;
	
	String[] currency = {"달러", "위안", "유로", "엔"};
	JPanel pane1;
	JPanel pane2;
	JLabel label1;
	JTextField text;  //원화 입력
	JButton button;
	JComboBox<String> comboBox;
	JLabel label2;    //원화 출력
	
	public ExchangeConverter() {
		//프레임 생성
		this.setTitle("환율 변환기");
		this.setSize(350, 150);
		this.setLocation(200, 100);
		
		//컴포넌트 객체 생성 및 프레임에 추가
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		//pane1 배치
		pane1.setLayout(new FlowLayout());
		label1 = new JLabel("원화");
		text = new JTextField(7);
		comboBox = new JComboBox<>(currency);
		button = new JButton("변환");
		
		//글꼴 변경
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		text.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		
		//pane2 배치
		pane2.setLayout(new FlowLayout());
		label2 = new JLabel();
		label2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		
		//패널에 추가
		pane1.add(label1);
		pane1.add(text);
		pane1.add(comboBox);
		pane1.add(button);
		
		pane2.add(label2);
		
		//변환 버튼 이벤트
		button.addActionListener(this);
		
		// 디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			float won = Float.parseFloat(text.getText());
			String currency = (String)comboBox.getSelectedItem();
			
			if(currency.equals("달러")) {
				won = won / USD;
				label2.setText(String.format("%.2f$", won));
			}else if(currency.equals("위안")) {
				won = won / CNY;
				label2.setText(String.format("%.2f￥", won));
			}else if(currency.equals("유로")) {
				won = won / EUR;
				label2.setText(String.format("%.2f€", won));
			}else if(currency.equals("엔")) {
				won = won / JPY;
				label2.setText(String.format("%.2f￥", won));
			}
		}
	}
}
