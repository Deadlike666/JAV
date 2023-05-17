import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Addition implements ActionListener {
    private JFrame frame;
    private JLabel num1Label, num2Label, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public Addition() {
        // 创建窗口和组件
        frame = new JFrame("二数之和");
        num1Label = new JLabel("第一个数：");
        num2Label = new JLabel("第二个数：");
        resultLabel = new JLabel("结果：");
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        addButton = new JButton("相加");

        // 设置布局
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        addButton.addActionListener(this);

        // 显示窗口
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // 获取输入的数字并计算结果
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int result = num1 + num2;
        resultField.setText(Integer.toString(result));
    }

    public static void main(String[] args) {
        new Addition();
    }
}
