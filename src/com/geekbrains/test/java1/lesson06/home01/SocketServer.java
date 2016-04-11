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

            ServerSocket servers = new ServerSocket(3000);
            while (true) {
                Socket fromclient = servers.accept();

                new Thread(new ClientHandler(fromclient)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
