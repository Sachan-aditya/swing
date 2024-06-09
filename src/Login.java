import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton loginBtn, clear, signUp;
    JTextField cardnoField;
    JPasswordField pinField;

    Login() {
        setTitle("Automated Teller Machine");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50, 10, 200, 100);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("OSTWARD", Font.BOLD, 40));
        text.setBounds(350, 20, 400, 50);

        JLabel cardno = new JLabel("Card NUMBER:");
        cardno.setFont(new Font("RALEWAY", Font.BOLD, 28));
        cardno.setBounds(50, 150, 250, 30);

        cardnoField = new JTextField();
        cardnoField.setFont(new Font("Arial", Font.PLAIN, 28));
        cardnoField.setBounds(300, 150, 250, 30);

        JLabel pin = new JLabel("PIN NUMBER:");
        pin.setFont(new Font("RALEWAY", Font.BOLD, 28));
        pin.setBounds(50, 220, 250, 30);

        pinField = new JPasswordField(); // Corrected class name
        pinField.setFont(new Font("Arial", Font.PLAIN, 28));
        pinField.setBounds(300, 220, 250, 30);

        loginBtn = new JButton("Sign IN");
        loginBtn.setFont(new Font("RALEWAY", Font.BOLD, 28));
        loginBtn.setBounds(100, 300, 150, 50);
        loginBtn.setBackground(Color.black);
        loginBtn.setForeground(Color.white);
        loginBtn.addActionListener(this);

        clear = new JButton("Clear");
        clear.setFont(new Font("RALEWAY", Font.BOLD, 28));
        clear.setBounds(300, 300, 150, 50);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);

        signUp = new JButton("Sign Up");
        signUp.setFont(new Font("RALEWAY", Font.BOLD, 28));
        signUp.setBounds(500, 300, 150, 50);
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);

        panel.add(label);
        panel.add(text);
        panel.add(cardno);
        panel.add(cardnoField);
        panel.add(pin);
        panel.add(pinField);
        panel.add(loginBtn);
        panel.add(clear);
        panel.add(signUp);

        add(panel);
        setSize(800, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardnoField.setText("");
            pinField.setText("");
        } else if (ae.getSource() == loginBtn) {
            // Implement login logic here
        } else if (ae.getSource() == signUp) {
            // Implement sign up logic here
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}