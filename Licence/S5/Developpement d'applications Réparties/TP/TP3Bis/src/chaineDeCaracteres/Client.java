

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",1234);
            System.out.println("Client Ready, Socket Created");

// Output

            OutputStream os = s.getOutputStream();
            System.out.println("Created OutputStream");

            PrintWriter pw = new PrintWriter(os,true);
            System.out.println("Created PrintWriter");

            Scanner sc = new Scanner(System.in);
            System.out.println("Write request message:");
            String msg = sc.nextLine();

            pw.println(msg);

            InputStream is = s.getInputStream();
            System.out.println("Created InputStream");

            InputStreamReader isr = new InputStreamReader(is);
            System.out.println("Created InputStreamReader");

            BufferedReader br = new BufferedReader(isr);
            System.out.println("Created BufferedReader");

            System.out.println("Awaiting Server Response");
            String res = br.readLine();
            System.out.println("the Server Sent the following msg: "+res);

            s.close();
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    
}
