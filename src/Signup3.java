import javax.swing.*;
import java.awt.*;

public class Signup3 extends JFrame {

    Signup3() {
        setTitle("ACCOUNT DETAILS");
        setLayout(null);

        JLabel l1 = new JLabel("<html><b>PAGE3</b></html>");
        l1.setBounds(200, 40, 400, 40);
        add(l1);

        JLabel accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setBounds(100, 100, 150, 30);
        add(accountTypeLabel);

        JRadioButton savingsRadioButton = new JRadioButton("Savings");
        savingsRadioButton.setBounds(100, 130, 100, 30);
        add(savingsRadioButton);

        JRadioButton currentRadioButton = new JRadioButton("Current");
        currentRadioButton.setBounds(200, 130, 100, 30);
        add(currentRadioButton);

        JRadioButton fixedDepositRadioButton = new JRadioButton("Fixed Deposit");
        fixedDepositRadioButton.setBounds(300, 130, 150, 30);
        add(fixedDepositRadioButton);

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingsRadioButton);
        accountTypeGroup.add(currentRadioButton);
        accountTypeGroup.add(fixedDepositRadioButton);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(650, 700, 100, 30);
        add(saveButton);

        setSize(850, 820);
        setLocation(350, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Signup3();
    }
}