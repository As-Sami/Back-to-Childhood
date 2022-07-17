package com.sami.backtochildhood;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import Server.NetworkConnection;

public class ChurPoliceMakeOnline {
    static void run(String name) throws IOException {
        Socket socket = new Socket("192.168.56.1", 12345);
        System.out.println("socket connecteds....");
        NetworkConnection nc = new NetworkConnection(socket);
        System.out.println("Network connected");

        Scanner sc = new Scanner(System.in);
        name = sc.next();
        nc.sendString(name + "|chur-police");
        String response = nc.recieveString();

        int turn = Integer.parseInt(response);

        new ChurPolice(nc, turn, name);
    }

    public static void main(String[] args) {
        try {
            run("sami");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}