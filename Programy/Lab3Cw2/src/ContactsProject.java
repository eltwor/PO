import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ContactsProject extends JFrame {
    private JPanel panel1;
    private JList list1;
    private JTextField textFieldName;
    private JTextField textFieldEmail;
    private JTextField textFieldPhone;
    private JTextField textFieldAddress;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JTextField textFieldDoB;

    public static void main(String[] args) {
        ContactsProject panel = new ContactsProject();
        panel.setVisible(true);
    }

    public ContactsProject() {
        super("Contacts");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] person = {textFieldName.getText(),
                        textFieldEmail.getText(),
                        textFieldPhone.getText(),
                        textFieldAddress.getText(),
                        textFieldDoB.getText()};

                new People(person);
            }
        });
    }
}
