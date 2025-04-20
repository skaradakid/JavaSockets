package za.co.wethinkcode.person;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Client {
    public static void main(String[] args){
        try {
            Socket soc = new Socket("localHost", 5050);
            System.out.println("connected to sever");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter a string");
            String str = userInput.readLine();
            PrintWriter out  = new PrintWriter(soc.getOutputStream(), true);
            out.println("sever says: " + str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
