package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame implements ActionListener {
    static JRadioButton linuxRadioButton, windowsRadioButton, macintoshRadioButton;
    static JButton OKButton;
    static JLabel ImageLabel;
    static JFrame f;
    static JPanel p;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("Windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Mac.png"));

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight,Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
    f = new JFrame("okienko");
        linuxRadioButton = new JRadioButton("linux");
        windowsRadioButton = new JRadioButton("windows");
        macintoshRadioButton = new JRadioButton("Mac");

        JPanel p = new JPanel();

        p.add(linuxRadioButton);
        p.add(windowsRadioButton);
        p.add(macintoshRadioButton);
;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (linuxRadioButton.isSelected()){
            ImageLabel.setIcon(resize(iconLinux),120,120);
        }
    }
}

