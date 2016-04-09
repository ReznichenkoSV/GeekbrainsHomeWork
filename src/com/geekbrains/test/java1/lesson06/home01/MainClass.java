package com.geekbrains.test.java1.lesson06.home01;

/*
Написать клиентскую часть чата, отсылка сообщения должна производиться по нажатию кнопки SEND.
Прослушку сообщений от сервера желательно вынести в отдельный поток.
*/

import java.io.IOException;

/**
 * Created by Reznichenko SV on 09.04.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        SocketServer server = new SocketServer();
        Thread threadServer = new Thread(server);
        threadServer.start();

        SwingClient w = new SwingClient();
    }
}
