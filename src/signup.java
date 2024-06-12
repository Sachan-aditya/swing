import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {

    // Declare components as instance variables
    JLabel fono, pd, name, fname, gender, dob, email, status, addressLabel, city, state, pin;
    JTextField namTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JRadioButton male, female, married, notmarried, other;
    JDateChooser dobDateChooser;
    JButton next;
    ButtonGroup genderGroup, maritalStatusGroup;
    long random;
    Databaseconnect databaseConnect;

    Signup() {
        setLayout(null);
        
           Random rand = new Random();
        int randomFono = 1000 + rand.nextInt(9000);
        fono = new JLabel("APPLICATION FORM NO." + randomFono);
        fono.setBounds(140, 20, 600, 40);
        Font font = new Font("RALEWAY", Font.BOLD, 30);
        fono.setFont(font);
        add(fono);

        pd = new JLabel("Personal DETAILS : PAGE 1");
        pd.setBounds(240, 60, 600, 40);
        Font font1 = new Font("RALEWAY", Font.BOLD, 20);
        pd.setFont(font1);
        add(pd);

        name = new JLabel("NAME");
        name.setBounds(100, 100, 200, 30); 
        add(name);

        namTextField = new JTextField();
        namTextField.setBounds(300, 100, 200, 30);
        add(namTextField);

        fname = new JLabel("FATHER'S NAME");
        fname.setBounds(100, 140, 200, 30); 
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 140, 200, 30);
        add(fnameTextField);

        gender = new JLabel("GENDER");
        gender.setBounds(100, 180, 200, 30); 
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 180, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 180, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        dob = new JLabel("DATE OF BIRTH");
        dob.setBounds(100, 220, 200, 30); 
        add(dob);

        dobDateChooser = new JDateChooser();
        dobDateChooser.setBounds(300, 220, 200, 30);
        add(dobDateChooser);

        email = new JLabel("Email");
        email.setBounds(100, 260, 200, 30); 
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 260, 200, 30);
        add(emailTextField);

        status = new JLabel("Marital Status");
        status.setBounds(100, 300, 200, 30); 
        add(status);

        married = new JRadioButton("YES");
        married.setBounds(300, 300, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

        notmarried = new JRadioButton("NO");
        notmarried.setBounds(400, 300, 80, 30);
        notmarried.setBackground(Color.WHITE);
        add(notmarried);

        other = new JRadioButton("OTHERS");
        other.setBounds(500, 300, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);

        maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(married);
        maritalStatusGroup.add(notmarried);
        maritalStatusGroup.add(other);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(100, 340, 200, 30); 
        add(addressLabel);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 340, 200, 30);
        add(addressTextField);

        city = new JLabel("City");
        city.setBounds(100, 380, 200, 30); 
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 380, 200, 30);
        add(cityTextField);

        state = new JLabel("State");
        state.setBounds(100, 420, 200, 30); 
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300, 420, 200, 30);
        add(stateTextField);

        pin = new JLabel("PINCODE");
        pin.setBounds(100, 460, 200, 30); 
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setBounds(300, 460, 200, 30);
        add(pinTextField);

        next = new JButton("Next");
        next.setBounds(300, 500, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);

        next.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 600); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setTitle("SIGN UP");

        databaseConnect = new Databaseconnect();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            try {
                String fono = String.valueOf(random);
                String name = namTextField.getText();
                if (name.isEmpty()) {
                    throw new Exception("Name field is empty");
                }

                String fatherName = fnameTextField.getText();
                if (fatherName.isEmpty()) {
                    throw new Exception("Father's Name field is empty");
                }

                String dob = ((JTextField)dobDateChooser.getDateEditor().getUiComponent()).getText();
                if (dob.isEmpty()) {
                    throw new Exception("Date of Birth field is empty");
                }

                String email = emailTextField.getText();
                if (email.isEmpty()) {
                    throw new Exception("Email field is empty");
                }

                String gender = male.isSelected()? "Male" : female.isSelected()? "Female" : "";
                if (gender.isEmpty()) {
                    throw new Exception("Gender is not selected");
                }

                String maritalStatus = married.isSelected()? "Married" : notmarried.isSelected()? "Not Married" : other.isSelected()? "Others" : "";
                if (maritalStatus.isEmpty()) {
                    throw new Exception("Marital Status is not selected");
                }

                String address = addressTextField.getText();
                if (address.isEmpty()) {
                    throw new Exception("Address field is empty");
                }

                String city = cityTextField.getText();
                if (city.isEmpty()) {
                    throw new Exception("City field is empty");
                }

                String state = stateTextField.getText();
                if (state.isEmpty()) {
                    throw new Exception("State field is empty");
                }

                String pincode = pinTextField.getText();
                if (pincode.isEmpty()) {
                    throw new Exception("Pincode field is empty");
                }

                // databaseConnect.actionPerformed(this); // This line is incorrect. You cannot call actionPerformed method on another class.

               setVisible(false);
               new Signup2(fono).setVisible(true);
                // Instead, you should call a method on databaseConnect that inserts the data into the database.
                databaseConnect.insertData(fono, name, fatherName, dob, email, gender, maritalStatus, address, city, state, pincode);

            } catch (Exception ex) {
                // Handle and display the exception message
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String args[]) {
        new Signup();
    }
}