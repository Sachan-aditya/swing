import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JFrame {

    Login() {
        setTitle("Automated Teller Machine");
        JPanel panel = new JPanel();
        panel.setLayout(null); // No layout manager
        panel.setBackground(Color.white);

        // Load and scale the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(100, 80, 100, 100); // Manually set position and size

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("OSTWARD", Font.BOLD, 40));
        text.setBounds(250,80, 400, 50); // Manually set position and size

        JLabel cardno = new JLabel("Card NUMBER");
        cardno.setFont(new Font("OSTWARD", Font.BOLD, 38));
        cardno.setBounds(150, 200, 300, 50); // Manually set position and size

        JLabel pin = new JLabel("PIN NUMBER");
        pin.setFont(new Font("OSTWARD", Font.BOLD, 38));
        pin.setBounds(150, 270, 300, 50); // Manually set position and size

        // Add components to the panel
        panel.add(label);
        panel.add(text);
        panel.add(cardno);
        panel.add(pin);

        // Add panel to the frame
        add(panel);
        setSize(600, 400); // Adjusted size for better visibility
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}
