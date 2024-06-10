import java.util.Random;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;

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

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 180, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(400, 180, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel dob = new JLabel("DATE OF BIRTH");
        dob.setBounds(100, 220, 200, 30); 
        add(dob);

        JDateChooser dobDateChooser = new JDateChooser();
        dobDateChooser.setBounds(300, 220, 200, 30);
        add(dobDateChooser);

        JLabel email = new JLabel("Email");
        email.setBounds(100, 260, 200, 30); 
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(300, 260, 200, 30);
        add(emailTextField);

        JLabel status = new JLabel("Marital Status");
        status.setBounds(100, 300, 200, 30); 
        add(status);

        JRadioButton married = new JRadioButton("YES");
        married.setBounds(300, 300, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton notmarried = new JRadioButton("NO");
        notmarried.setBounds(400, 300, 80, 30);
        notmarried.setBackground(Color.WHITE);

        add(notmarried);

        JRadioButton other = new JRadioButton("OTHERS");
        other.setBounds(500, 300, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(married);
        maritalStatusGroup.add(notmarried);
        maritalStatusGroup.add(other);

        JTextField address = new JTextField();
        address.setBounds(300, 340, 200, 30);
        add(address);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(100, 340, 200, 30); 
        add(addressLabel);

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

        JButton next = new JButton("Next");
        next.setBounds(300, 500, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 600); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setTitle("SIGN UP");
    }

    public static void main(String args[]) {
        new Signup();
    }
}
