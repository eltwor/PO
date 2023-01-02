import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample extends JFrame {

    private JPanel panel1;
    private JComboBox comboBox1;
    private JLabel LabelWybor;
    private JList list1;
    private JButton button1;
    private JButton button2;
    private JTable table1;

    public static void main(String[] args) {
        ComboBoxExample panel = new ComboBoxExample();
        panel.setVisible(true);
    }
    public ComboBoxExample() {
        super("Wybierz Kurs");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 600);
        createTable();

        // II sposób

        createItemComboBox();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Wybrano: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                LabelWybor.setText(data);
            }
        });
    }

    private void createItemComboBox() {
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"","głodna","spać","husky"}));
    }

    private void createTable() {
       Object[][] data = {
               {"film 1",2022,9.42,252551},
               {"film 2",2021,5.62,14145},
               {"film 3",2012,8.42,267725},
               {"film 4",2018,7.62,63773},
       };
       table1.setModel(new DefaultTableModel(
               data,new String[]{"tytuł","rok","ocena","ilość opinii"}
       ));
    }
}
