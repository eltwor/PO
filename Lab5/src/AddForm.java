import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddForm extends JFrame {
    private JPanel panel1;
    private JTextField textFieldTitle;
    private JComboBox comboBoxPriority;
    private JButton zapiszButton;


    public AddForm() {
        super("AddFrom");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 600);
        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Lab5 n = new Lab5();
                n.setVisible(true);
            }
        });
    }
}
