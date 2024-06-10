import java.util.Random;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class signup extends JFrame {

    signup() {
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 900L + 1000L);
        JLabel fono = new JLabel("APPLICATION FORM NO." + random);
        fono.setBounds(140, 20, 600, 40);
        Font font = new Font("RALEWAY", Font.BOLD, 30);
        fono.setFont(font);
        add(fono);

        JLabel pd = new JLabel("Personal DETAILS : PAGE 1");
        pd.setBounds(240, 60, 600, 40);
        Font font1 = new Font("RALEWAY", Font.BOLD, 20);
        pd.setFont(font1);
        add(pd);

        JLabel name = new JLabel("NAME");
        name.setBounds(100, 100, 200, 30); // Example bounds
        add(name);

        JLabel fname = new JLabel("FATHER'S NAME");
        fname.setBounds(100, 140, 200, 30); // Example bounds
        add(fname);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(100, 180, 200, 30); // Example bounds
        add(gender);

        JLabel dob = new JLabel("DATE OF BIRTH");
        dob.setBounds(100, 220, 200, 30); // Example bounds
        add(dob);

        setSize(800, 600); // Set the size of the JFrame
        setVisible(true); // Make the JFrame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
    }

    public static void main(String args[]) {
        new signup();
    }
}