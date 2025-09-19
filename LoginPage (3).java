import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        panel.add(userLabel);

        userTextField = new JTextField(20);
        userTextField.setBounds(120, 30, 160, 25);
        panel.add(userTextField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 70, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(120, 70, 160, 25);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = String.valueOf(passwordField.getPassword());

        // Sample authentication logic
        if(username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage login = new LoginPage();
            login.setVisible(true);
        });
    }
}