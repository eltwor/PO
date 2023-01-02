import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioDemo extends JFrame {
    private JPanel panel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel LabelObrazek;
    private JButton OKButton;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMacintosh = new ImageIcon(getClass().getResource("apple.png"));

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        RadioDemo panel = new RadioDemo();
        panel.setVisible(true);
    }
    public RadioDemo() {
        super("Choose Operating System");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelObrazek.setIcon(resize(iconLinux,120,200));
            }
        });

        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelObrazek.setIcon(resize(iconWindows,120,200));

            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelObrazek.setIcon(resize(iconMacintosh,120,200));

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(RadioDemo.this, "Wybrano: Linux");
                }
                if(windowsRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(RadioDemo.this, "Wybrano: Windows");
                }
                if(macintoshRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(RadioDemo.this, "Wybrano: Macintosh");
                }
            }
        });
    }
}

