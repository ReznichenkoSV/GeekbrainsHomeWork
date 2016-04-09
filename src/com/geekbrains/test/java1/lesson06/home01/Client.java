package com.geekbrains.test.java1.lesson06.home01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Client side");

        System.out.println("Connecting to... " + "localhost");
        Socket fromserver = new Socket("localhost", 3000);

        Scanner in = new Scanner(fromserver.getInputStream());
        PrintWriter out = new PrintWriter(fromserver.getOutputStream(), true);
        Scanner inu = new Scanner(System.in);

        String fuser, fserver;

        while ((fuser = inu.nextLine()) != null) {
            out.println(fuser);
            fserver = in.nextLine();
            System.out.println(fserver);
            if (fuser.equalsIgnoreCase("close")) break;
            if (fuser.equalsIgnoreCase("exit")) break;
        }

        out.close();
        in.close();
        inu.close();
        fromserver.close();
    }
}
