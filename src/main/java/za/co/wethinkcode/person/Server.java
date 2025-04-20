package za.co.wethinkcode.person;

import java.net.Socket;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args){
        System.out.println("waiting for clients!");
        try {
            ServerSocket ss = new ServerSocket(5050);
            Socket soc = ss.accept();
            System.out.println("connection established");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
