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
        jta.setEnabled(false);
        jta.setDisabledTextColor(Color.BLACK);
        jta.setFont(new Font("Courier", Font.ITALIC, 10));

        SwingClientHandler clientHandler = new SwingClientHandler("localhost", 3000, jta);
        new Thread(clientHandler).start();

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jtf.getText();
                clientHandler.send(text);
                jtf.setText("");
            }
        });


        setVisible(true);
    }


}
