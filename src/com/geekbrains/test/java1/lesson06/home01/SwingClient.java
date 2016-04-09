package com.geekbrains.test.java1.lesson06.home01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class SwingClient extends JFrame {

    public SwingClient() throws IOException {
        System.out.println("Welcome to Client side");

        System.out.println("Connecting to... " + "localhost");
        Socket fromserver = new Socket("localhost", 3000);

        Scanner in = new Scanner(fromserver.getInputStream());
        PrintWriter out = new PrintWriter(fromserver.getOutputStream(), true);
        Scanner inu = new Scanner(System.in);

        String fuser, fserver;

        setTitle("Client chat");
        setSize(400, 400);
        setLocation(1200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea jta = new JTextArea();
        jta.setBackground(Color.lightGray);
        add(jta);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        add(southPanel, BorderLayout.SOUTH);
        JButton jb = new JButton("SEND");
        JTextField jtf = new JTextField();
        southPanel.add(jb, BorderLayout.EAST);
        southPanel.add(jtf, BorderLayout.CENTER);
        jta.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jtf.getText();
                //jta.append(text + '\n');
                out.println(text);
                jtf.setText("");
            }
        });
        setVisible(true);

        while ((fuser = in.nextLine()) != null) {
            jta.append(fuser + '\n');
            if (fuser.equalsIgnoreCase("close") || fuser.equalsIgnoreCase("exit")) {
                break;
            }
        }

        out.close();
        in.close();
        inu.close();
        fromserver.close();
    }


}
