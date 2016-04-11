package com.geekbrains.test.java1.lesson06.home01;

import javax.swing.*;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 11/04/2016.
 */
public class SwingClientHandler implements Runnable {
    private String server;
    private int port;
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private JTextArea outForm;

    public SwingClientHandler(String server, int port, JTextArea outForm) {
        this.server = server;
        this.port = port;
        this.outForm = outForm;
        init();
    }

    @Override
    public void run() {
        String line;
        while (true) {
            line = in.nextLine();
            outForm.append(line + '\n');

            if (line.equalsIgnoreCase("close") || line.equalsIgnoreCase("exit")) {
                break;
            }
        }

        in.close();
    }

    private void init() {
        try {
            s = new Socket(server, port);
            in = new Scanner(s.getInputStream());
            out = new PrintWriter(s.getOutputStream(), true);
        } catch (Exception e) {
        }
    }

    public void send(String s) {
        if (!s.isEmpty())
            out.println(s);
    }
}
