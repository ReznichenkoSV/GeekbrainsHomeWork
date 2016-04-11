package com.geekbrains.test.java1.lesson06.home01;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 11/04/2016.
 */
public class ClientHandler implements Runnable {
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private static int countClient = 0;
    private String name;

    public ClientHandler(Socket s) {
        this.s = s;
        name = "User#" + countClient++;
    }

    @Override
    public void run() {
        try {
            in = new Scanner(s.getInputStream());
            out = new PrintWriter(s.getOutputStream(), true);

            String line;

            out.println("Hello, user!");
            while (true) {
                line = in.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                out.println(String.format("%s: %s", name, line));
                System.out.println(String.format("%s: %s", name, line));
            }

            out.close();
            in.close();
            s.close();
        } catch (Exception e) {
        }
    }
}
