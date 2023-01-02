import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panel1;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel JLabelLogin;
    private JLabel JLabelPassword;
    private JLabel JLabelWynik;

    public static void main(String[] args) {
        LoginForm panel = new LoginForm();
        panel.setVisible(true);
    }
    public LoginForm() {
        super("Username and Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginInput = loginField.getText();
                String passInput = passwordField.getText();

                JLabelWynik.setText("Login: " +loginInput + " Hasło: " +passInput);
            }
        });
    }
}
