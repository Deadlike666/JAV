import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JLabel label1, label2, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public CalculatorGUI() {
        setTitle("Addition Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label1 = new JLabel("Enter the first number:");
        label2 = new JLabel("Enter the second number:");
        resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        panel1.add(label1);
        panel1.add(num1Field);

        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.add(label2);
        panel2.add(num2Field);

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(addButton);

        JPanel panel4 = new JPanel(new GridLayout(2, 1));
        panel4.add(resultLabel);
        panel4.add(resultField);

        JPanel contentPane = new JPanel(new GridLayout(4, 1));
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);
        contentPane.add(panel4);

        setContentPane(contentPane);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addButton) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 + num2;
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
