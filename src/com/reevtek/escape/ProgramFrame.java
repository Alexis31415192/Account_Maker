package com.reevtek.escape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.*;
import java.util.List;

public class ProgramFrame extends JFrame implements ActionListener {

    //Create all the necessary objects
    static LocalTime time = LocalTime.now();

    URL url = ClassLoader.getSystemClassLoader().getResource("com/reevtek/escape/assets/Watermark.png");
    ImageIcon logo = new ImageIcon(url);

    ImageIcon placeholder = new ImageIcon("src/Assets/PlaceholderImage.png");

    JButton signOn = new JButton();

    JButton signUp = new JButton();

    JLabel label = new JLabel();

    JFrame frame = new JFrame();

    ProgramFrame(){//Constructor

        //Constructs frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("Account maker");
        frame.setIconImage(logo.getImage());
        frame.setLayout(new FlowLayout());

        //Constructs labels
        label.setText("Please select an option");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.white);

        //Constructs buttons
        signOn.setBounds(200, 100, 100, 50);
        signOn.setForeground(Color.GREEN);
        signOn.setBackground(Color.gray);
        signOn.setForeground(Color.white);
        signOn.setBackground(Color.gray);
        signOn.setBorder(BorderFactory.createEtchedBorder());
        signOn.setText("Sign on");
        signOn.setFocusable(false);
        signOn.addActionListener(this);

        signUp.setBounds(200, 200, 100, 50);
        signOn.setForeground(Color.GREEN);
        signOn.setBackground(Color.gray);
        signOn.setForeground(Color.white);
        signOn.setBackground(Color.gray);
        signUp.setBorder(BorderFactory.createEtchedBorder());
        signUp.setText("Sign up");
        signUp.setFocusable(false);
        signUp.addActionListener(this);

        //Agglomerates everything nicely :3
        frame.add(signOn);
        frame.add(signUp);
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == signOn) {

            System.out.println(time + " Selected \"Sign on\"\n");

            JOptionPane.showConfirmDialog(null, "Signing on isn't functional yet...", "ERROR", JOptionPane.CANCEL_OPTION);

            SignedOn signedOn = new SignedOn();

            frame.dispose();
        }
        if(e.getSource() == signUp){

            System.out.println(time + " Selected \"Sign up\"\n");

/*//TODO delete this shit
            String username = JOptionPane.showInputDialog("Create a unique username:");
            System.out.printf(time + " Set username to \"%s\"", username);
*/

            SignedUp signedUp = new SignedUp();
            System.out.printf("GUI info: %s", signedUp);//TODO make sign on

            frame.dispose();
        }
    }
}

