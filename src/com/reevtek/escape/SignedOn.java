package com.reevtek.escape;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.time.LocalTime;

public class SignedOn {

    static LocalTime time = LocalTime.now();

    JFrame frame = new JFrame();

    URL url = ClassLoader.getSystemClassLoader().getResource("com/reevtek/escape/assets/Watermark.png");
    ImageIcon logo = new ImageIcon(url);

    JLabel label = new JLabel();

    SignedOn(){

        System.out.println(time + " Opened new window\n");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Sign on");
        frame.setIconImage(logo.getImage());

        label.setText("WIP");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.white);

        frame.setVisible(true);
    }
}
