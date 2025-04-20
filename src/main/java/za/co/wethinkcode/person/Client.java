package za.co.wethinkcode.person;

import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try {
            Socket soc = new Socket("localHost", 5050);
            System.out.println("connected to sever");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
