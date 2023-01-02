import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5 extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel filePanel;
    private JPanel aboutPanel;
    private JList listToDo;
    private JList listProgress;
    private JList listDone;
    private JButton addNewTaskButton;
    private JTextField textFieldInfo;
    private JButton backButton;
    private JButton closeButton;

    public static void main(String[] args) {
        Lab5 panel = new Lab5();
        panel.setVisible(true);
    }
    public Lab5() {
        super("Lab5");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 600);
        addNewTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddForm n = new AddForm();
                n.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JTabbedPane.setSelectedIndex(int 1);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
