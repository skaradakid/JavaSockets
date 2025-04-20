package za.co.wethinkcode.person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args){
        System.out.println("waiting for clients!");
        try {
            ServerSocket ss = new ServerSocket(5050);
            Socket soc = ss.accept();
            System.out.println("connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out  = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says: "+ str);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
