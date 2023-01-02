import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxDemo extends JFrame {
    private JPanel panel1;
    private JCheckBox CheckBoxJava;
    private JCheckBox CheckboxCSharp;
    private JCheckBox CheckboxCPlus;
    private JCheckBox CheckboxPython;
    private JButton okButton;
    int wynik =0;
    public static void main(String[] args) {
            CheckboxDemo panel = new CheckboxDemo();
            panel.setVisible(true);
    }

    public CheckboxDemo() {
        super("Wybierz Kurs");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "--------- \n Razem:";
                if(CheckBoxJava.isSelected()) {
                    wynik += 3500;
                    message = "Java #price 3500PLN\n" +message;
                }
                if(CheckboxCPlus.isSelected()) {
                    wynik += 3000;
                    message = "C++ #price 4000 PLN\n" +message;
                }
                if(CheckboxCSharp.isSelected()) {
                    wynik += 4000;
                    message = "C# #price 3000 PLN\n" +message;
                }
                if(CheckboxPython.isSelected()) {
                    wynik += 5000;
                    message = "Python #price 5000 PLN\n" +message;
                }

                JOptionPane.showMessageDialog(CheckboxDemo.this,message + wynik + "PLN");
            }
        });
    }
}
