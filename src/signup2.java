import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser; // Added semicolon here
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener {

    JLabel ad, religionLabel, categoryLabel, educationLabel, occupationLabel, qualificationLabel, panNumberLabel, incomeLabel, adharNumberLabel, seniorCitizenLabel, existingAccountLabel;
    JTextField occupationTextField, qualificationTextField, panNumberTextField, adharNumberTextField, seniorCitizenTextField, existingAccountTextField;
    JComboBox<String> religionComboBox, categoryComboBox, educationComboBox, incomeComboBox;
    JDateChooser dobDateChooser;
    JButton next;
    ButtonGroup genderGroup, maritalStatusGroup;
    JRadioButton male, female, married, notmarried, other;
    long random;
    Databaseconnect databaseConnect;

    Signup2() {
        setLayout(null);
        setTitle("NEW ACCOUNT DETAILS");

        ad = new JLabel("Additional DETAILS : PAGE 2");
        ad.setBounds(240, 60, 600, 40);
        ad.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(ad);

        religionLabel = new JLabel("RELIGION");
        religionLabel.setBounds(100, 100, 200, 30);
        add(religionLabel);

        String[] religions = {"Select Religion","HINDU", "MUSLIM", "CHRISTIAN", "SIKH", "OTHERS"};
        religionComboBox = new JComboBox<>(religions);
        religionComboBox.setSelectedIndex(0);
        religionComboBox.setBounds(300, 100, 200, 30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);

        categoryLabel = new JLabel("CATEGORY");
        categoryLabel.setBounds(100, 140, 200, 30);
        add(categoryLabel);

        String[] categories = {"Select Category","GENERAL", "OBC", "SC", "ST", "OTHERS"};
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setBounds(300, 140, 200, 30);
        categoryComboBox.setBackground(Color.WHITE);

        add(categoryComboBox);

        educationLabel = new JLabel("EDUCATION");
        educationLabel.setBounds(100, 180, 200, 30);
        add(educationLabel);

        String[] educationLevels = {"Select Education","High School", "Undergraduate", "Graduate", "Postgraduate", "Doctorate"};
        educationComboBox = new JComboBox<>(educationLevels);
        educationComboBox.setBounds(300, 180, 200, 30);
        educationComboBox.setBackground(Color.WHITE);
        add(educationComboBox);

        occupationLabel = new JLabel("OCCUPATION");
        occupationLabel.setBounds(100, 220, 200, 30);
        add(occupationLabel);

        occupationTextField = new JTextField();
        occupationTextField.setBounds(300, 220, 200, 30);
        add(occupationTextField);

        qualificationLabel = new JLabel("QUALIFICATION");
        qualificationLabel.setBounds(100, 260, 200, 30);
        add(qualificationLabel);

        qualificationTextField = new JTextField();
        qualificationTextField.setBounds(300, 260, 200, 30);
        add(qualificationTextField);

        panNumberLabel = new JLabel("PAN NUMBER");
        panNumberLabel.setBounds(100, 300, 200, 30);
        add(panNumberLabel);

        panNumberTextField = new JTextField();
        panNumberTextField.setBounds(300, 300, 200, 30);
        add(panNumberTextField);

        incomeLabel = new JLabel("INCOME");
        incomeLabel.setBounds(100, 340, 200, 30);
        add(incomeLabel);

        String[] incomes = {"","NULL", "upto 150000", "upto 250000", "upto 500000", "upto 1000000"};
        incomeComboBox = new JComboBox<>(incomes);
        incomeComboBox.setBounds(300, 340, 200, 30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);

        adharNumberLabel = new JLabel("ADHAR NUMBER");
        adharNumberLabel.setBounds(100, 380, 200, 30);
        add(adharNumberLabel);

        adharNumberTextField = new JTextField();
        adharNumberTextField.setBounds(300, 380, 200, 30);
        add(adharNumberTextField);

        seniorCitizenLabel = new JLabel("SENIOR CITIZEN");
        seniorCitizenLabel.setBounds(100, 420, 200, 30);
        add(seniorCitizenLabel);

        seniorCitizenTextField = new JTextField();
        seniorCitizenTextField.setBounds(300, 420, 200, 30);
        add(seniorCitizenTextField);

        existingAccountLabel = new JLabel("EXISTING ACCOUNT");
        existingAccountLabel.setBounds(100, 460, 200, 30);
        add(existingAccountLabel);

        existingAccountTextField = new JTextField();
        existingAccountTextField.setBounds(300, 460, 200, 30);
        add(existingAccountTextField);

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
                String religion = (String) religionComboBox.getSelectedItem();
                String category = (String) categoryComboBox.getSelectedItem();
                String education = (String) educationComboBox.getSelectedItem();
                String occupation = occupationTextField.getText();
                String qualification = qualificationTextField.getText();
                String panNumber = panNumberTextField.getText();
                String income = (String) incomeComboBox.getSelectedItem();
                String adharNumber = adharNumberTextField.getText();
                String seniorCitizen = seniorCitizenTextField.getText();
                String existingAccount = existingAccountTextField.getText();

                if (religion.isEmpty() || category.isEmpty() || education.isEmpty() || occupation.isEmpty() || qualification.isEmpty() ||
                        panNumber.isEmpty() || income.isEmpty() || adharNumber.isEmpty() || seniorCitizen.isEmpty() || existingAccount.isEmpty()) {
                    throw new Exception("Please fill all the fields");
                }

                // Assuming the databaseConnect.insertData method exists
                databaseConnect.insertData(fono, religion, category, education, occupation, qualification, panNumber, income, adharNumber, seniorCitizen, existingAccount);

                JOptionPane.showMessageDialog(this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Signup2();
    }
}
