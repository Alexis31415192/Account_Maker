package com.reevtek.escape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.LocalTime;

public class SignedUp implements ActionListener {

    static LocalTime time = LocalTime.now();

    JFrame frame = new JFrame();

    URL url = ClassLoader.getSystemClassLoader().getResource("com/reevtek/escape/assets/Watermark.png");
    ImageIcon logo = new ImageIcon(url);

    JTextField usernameField = new JTextField();
    JTextField passwordField = new JTextField();

    JButton createUsername;
    JButton createPassword;

    SignedUp(){

        System.out.println(time + " Opened new window\n");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Sign up");
        frame.setIconImage(logo.getImage());
        frame.setLayout(new FlowLayout());

        createUsername = new JButton("Submit username");
        createPassword = new JButton("Submit password");

        usernameField.setPreferredSize(new Dimension(250, 40));
        passwordField.setPreferredSize(new Dimension(250, 40));

        createUsername.setEnabled(true);
        createUsername.addActionListener(this);
        createPassword.setEnabled(true);
        createPassword.addActionListener(this);

        frame.add(usernameField);
        frame.add(createUsername);
        frame.add(passwordField);
        frame.add(createPassword);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == createUsername){

            usernameField.getText();
        }

        if(e.getSource() == createPassword){

            passwordField.getText();
        }
    }
}

