import java.util.Random;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Signup extends JFrame {

    Signup() {
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
        name.setBounds(100, 100, 200, 30); 
        add(name);

        JTextField namTextField = new JTextField();
        namTextField.setBounds(300, 100, 200, 30);
        add(namTextField);

        JLabel fname = new JLabel("FATHER'S NAME");
        fname.setBounds(100, 140, 200, 30); 
        add(fname);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 140, 200, 30);
        add(fnameTextField);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(100, 180, 200, 30); 
        add(gender);

        JTextField genderTextField = new JTextField();
        genderTextField.setBounds(300, 180, 200, 30);
        add(genderTextField);

        JLabel dob = new JLabel("DATE OF BIRTH");
        dob.setBounds(100, 220, 200, 30); 
        add(dob);

        JTextField dobTextField = new JTextField();
        dobTextField.setBounds(300, 220, 200, 30);
        add(dobTextField);

        JLabel email = new JLabel("Email");
        email.setBounds(100, 260, 200, 30); 
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(300, 260, 200, 30);
        add(emailTextField);

        JLabel status = new JLabel("Marital Status");
        status.setBounds(100, 300, 200, 30); 
        add(status);

        JTextField statusTextField = new JTextField();
        statusTextField.setBounds(300, 300, 200, 30);
        add(statusTextField);

        JLabel address = new JLabel("Address");
        address.setBounds(100, 340, 200, 30); 
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(300, 340, 200, 30);
        add(addressTextField);

        JLabel city = new JLabel("City");
        city.setBounds(100, 380, 200, 30); 
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setBounds(300, 380, 200, 30);
        add(cityTextField);

        JLabel state = new JLabel("State");
        state.setBounds(100, 420, 200, 30); 
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setBounds(300, 420, 200, 30);
        add(stateTextField);

        JLabel pin = new JLabel("PINCODE");
        pin.setBounds(100, 460, 200, 30); 
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 460, 200, 30);
        add(pinTextField);

        setSize(800, 600); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public static void main(String args[]) {
        new Signup();
    }
}