import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JFrame {

    Login() {
        setTitle("Automated Teller Machine");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20)); // FlowLayout to align components horizontally
        panel.setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(text.getFont().deriveFont(30.0f));

        panel.add(label);
        panel.add(text);

        add(panel);
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}
