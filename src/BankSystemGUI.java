import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankSystemGUI extends JFrame implements ActionListener {

    private JLabel label1, label2, messageLabel;
    private JPasswordField passwordField;
    private JButton submitButton;
    private int attemptsLeft = 3;

    public BankSystemGUI() {
        setTitle("Bank Password System");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label1 = new JLabel("Please enter your password:");
        label2 = new JLabel("Attempts left: " + attemptsLeft);
        messageLabel = new JLabel("");

        passwordField = new JPasswordField(10);
        passwordField.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        panel1.add(label1);
        panel1.add(passwordField);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(submitButton);

        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel3.add(label2);
        panel3.add(messageLabel);

        JPanel contentPane = new JPanel(new GridLayout(3, 1));
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);

        setContentPane(contentPane);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == submitButton || event.getSource() == passwordField) {
            String password = new String(passwordField.getPassword());
            if (password.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Password correct!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                attemptsLeft--;
                if (attemptsLeft == 0) {
                    JOptionPane.showMessageDialog(this, "Incorrect password. Account locked.", "Error", JOptionPane.ERROR_MESSAGE);
                    dispose();
                } else {
                    label2.setText("Attempts left: " + attemptsLeft);
                    messageLabel.setText("Incorrect password. Please try again.");
                    passwordField.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new BankSystemGUI();
    }
}