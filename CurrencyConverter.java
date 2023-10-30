import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

    
        JLabel label = new JLabel("Amount in CHF:");
        label.setBounds(20, 30, 100, 20);

        JTextField frankenTextField = new JTextField();
        frankenTextField.setBounds(120, 30, 100, 20);

        JLabel resultLabel = new JLabel("Amount in $:");
        resultLabel.setBounds(20, 60, 100, 20);

        JLabel resultLabelYen = new JLabel("Amount in Yen:");
        resultLabelYen.setBounds(20, 90, 100, 20);

        JTextField dollarTextField = new JTextField();
        dollarTextField.setBounds(120, 60, 100, 20);
        dollarTextField.setEditable(false);


        JTextField yenTextField = new JTextField();
        yenTextField.setBounds(120, 90, 100, 20);
        yenTextField.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(100, 120, 100, 30);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double franken = Double.parseDouble(frankenTextField.getText());
                    double dollar = franken * 1.11; // fixierter Wechselkurs 
                    double yen = franken * 165.10;
                    dollarTextField.setText(String.format("%.2f", dollar));
                    yenTextField.setText(String.format("%.2f", yen));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid value");
                }
            }
        });

        frame.add(label);
        frame.add(frankenTextField);
        frame.add(resultLabel);
        frame.add(resultLabelYen);
        frame.add(dollarTextField);
        frame.add(yenTextField);
        frame.add(convertButton);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}