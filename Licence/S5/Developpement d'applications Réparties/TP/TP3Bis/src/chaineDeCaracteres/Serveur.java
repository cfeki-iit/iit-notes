package chaineDeCaracteres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("ServerSocket Created, Awaiting Client");
            Socket s = ss.accept();
            System.out.println("Client Found, Socket Created");
// input
            InputStream is = s.getInputStream();
            System.out.println("Created InputStream");

            InputStreamReader isr= new InputStreamReader(is);
            System.out.println("Created InputStreamReader");
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Created BufferedReader");

            //lecture 
            String msg = br.readLine();
            System.out.println("le Client a envoyé : "+msg);
// output
            OutputStream os = s.getOutputStream();
            System.out.println("Created OutputStream");

            PrintWriter pw = new PrintWriter(os,true);
            System.out.println("Created PrintWriter");

            Scanner sc = new Scanner(System.in);
            System.out.println("Write response message: ");
            String response=sc.nextLine();
            sc.close();
            pw.println(response);
            System.out.println("Response Sent");

            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
