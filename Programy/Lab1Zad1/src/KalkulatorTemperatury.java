import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorTemperatury extends JFrame {
    private JPanel panel1;
    private JButton buttonOblicz;
    private JTextField textFieldCelsius;
    private JLabel JLabelCelsius;
    private JLabel JLabelWynik;

    public static void main(String[] args) {
        KalkulatorTemperatury kalkTemp = new KalkulatorTemperatury();
        kalkTemp.setVisible(true);
    }

    public KalkulatorTemperatury() {
        super("Celsjusze na Farenheity");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        buttonOblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TempCelsius = Double.parseDouble(textFieldCelsius.getText());
                double TempFahrenheit = 1.8*TempCelsius+32;
                JLabelWynik.setText(String.valueOf(TempFahrenheit));
            }
        });
    }
}
