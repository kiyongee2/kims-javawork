package exchange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyConverter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("환율 변환기");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel amountLabel = new JLabel("금액을 입력하세요:");
        panel.add(amountLabel);

        NumberFormat format = NumberFormat.getNumberInstance();
        JFormattedTextField amountField = new JFormattedTextField(format);
        amountField.setColumns(10);
        panel.add(amountField);

        JLabel choiceLabel = new JLabel("원화(KRW)로 변환하려면 'K', 달러(USD)로 변환하려면 'D'를 입력하세요:");
        panel.add(choiceLabel);

        JTextField choiceField = new JTextField(1);
        panel.add(choiceField);

        JButton convertButton = new JButton("변환");
        panel.add(convertButton);

        JLabel resultLabel = new JLabel();
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String amountText = amountField.getText();
                String choice = choiceField.getText().trim();

                if (amountText.isEmpty() || !amountText.matches("\\d+(\\.\\d+)?")) {
                    JOptionPane.showMessageDialog(frame, "유효한 숫자를 입력하세요.");
                } else if (!choice.matches("[KD]")) {
                    JOptionPane.showMessageDialog(frame, "'K' 또는 'D' 중 하나를 입력하세요.");
                } else {
                    double amount = Double.parseDouble(amountText);
                    double convertedAmount = (choice.equals("K")) ? amount * getExchangeRateForKRW() : amount * getExchangeRateForUSD();
                    resultLabel.setText("환전 결과: " + convertedAmount + " " + choice);
                }
            }
        });

        frame.setVisible(true);

	}
	
	// 환율 계산을 위한 메서드 (실제 환율 데이터를 여기에 추가해야 합니다)
    private static double getExchangeRateForKRW() {
        return 1200; // 예시 환율
    }

    private static double getExchangeRateForUSD() {
        return 1.0; // 예시 환율
    }

}
