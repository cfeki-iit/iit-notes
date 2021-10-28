

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.sound.sampled.Line;

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

           

            InputStream is = s.getInputStream();
            System.out.println("Created InputStream");

            InputStreamReader isr = new InputStreamReader(is);
            System.out.println("Created InputStreamReader");

            BufferedReader br = new BufferedReader(isr);
            System.out.println("Created BufferedReader");

            String msgServ;
            Scanner sc = new Scanner(System.in);
            String msgCli="";
            while(!msgCli.toUpperCase().equals("END")){
                msgServ = br.readLine();
                System.out.println(msgServ);
                msgCli = sc.nextLine();
                pw.println(msgCli);
               
            }

    
            sc.close();
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
