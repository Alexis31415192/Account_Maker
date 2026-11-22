package com.reevtek.escape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.LocalTime;

public class SignedUp extends EscapeClass implements ActionListener {

    static LocalTime time = LocalTime.now();

    JFrame frame = new JFrame();

    URL url = ClassLoader.getSystemClassLoader().getResource("com/reevtek/escape/assets/Watermark.png");
    ImageIcon logo = new ImageIcon(url);

    JTextField usernameField = new JTextField();
    JTextField passwordField = new JTextField();

    JButton create;

    SignedUp() {

        System.out.println(time + " : Opened new window\n");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 1000);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Sign up");
        frame.setIconImage(logo.getImage());
        frame.setLayout(new FlowLayout());

        create = new JButton("Submit");

        usernameField.setPreferredSize(new Dimension(250, 40));
        usernameField.setText("CreateName");
        passwordField.setPreferredSize(new Dimension(250, 40));
        passwordField.setText("CreatePassword");

        create.setEnabled(true);
        create.addActionListener(this);

        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(create);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == create && usernameField.getText() != null && usernameField.getText().length() > 4 || usernameField.getText().length() < 12 && passwordField.getText().length() > 8) {

            String username = usernameField.getText();
            String password = passwordField.getText();

            System.out.println(time + " : Set username: " + username + "\n");
            System.out.println(time + " : Set password: " + password + "\n");
        }
        else if (e.getSource() == create) {

            System.out.println("INVALID");
        }

    }
}

