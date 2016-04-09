package com.geekbrains.test.java1.lesson06.home01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class SocketServer implements Runnable {
    private int countClient = 0;

    public SocketServer() {
    }

    @Override
    public void run() {
        try {
            System.out.println("Welcome to Server side");
            Scanner in = null;
            PrintWriter out = null;

            ServerSocket servers = new ServerSocket(3000);
            // create server socket
            System.out.print("Waiting for a client...");
            Socket fromclient = servers.accept();
            countClient++;
            System.out.println("Client connected");

            in = new Scanner(fromclient.getInputStream());
            out = new PrintWriter(fromclient.getOutputStream(), true);

            String input, output;

            System.out.println("Wait for messages");
            while ((input = in.nextLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println(String.format("Client#%d: %s", countClient, input));
                System.out.println(input);
            }

            out.close();
            in.close();
            fromclient.close();
            servers.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
