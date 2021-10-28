
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.cert.PKIXBuilderParameters;
import java.util.Scanner;

public class Server {
    public static String listServices = "--------------------\tVeuillez Choisir un service parmi la liste suivante(tapez le numero adéquat):\t\t1. Ajouter un Etudiant" + 
                            "\t\t2. Retrouver un etudiant par son nom et prénom"+
                            "\t\t3. Lister l'ensemble des Etudiants"+
                            "\t\t4. Lister l'ensemble des Services"+
                            "\t\tTapez END pour arrêter le serveur"+
                            "--------------------";
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("ServerSocket Created, Awaiting Client");
            Socket s = ss.accept();
            System.out.println("Client Found, Socket Created");
// input Objects
            InputStream is = s.getInputStream();
            System.out.println("Created InputStream");

            InputStreamReader isr= new InputStreamReader(is);
            System.out.println("Created InputStreamReader");
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Created BufferedReader");
        
//  Output Objects
            OutputStream os = s.getOutputStream();
            System.out.println("Created OutputStream");

            PrintWriter pw = new PrintWriter(os,true);
            System.out.println("Created PrintWriter");

            
            pw.println(listServices);
            System.out.println("Sent Message :" +listServices);
            
            //read client response 
             //lecture 
             String msgCli="";

             while(!msgCli.toUpperCase().equals("END")){
                // Send Service List 
                
                System.out.println("awaiting client response");
                msgCli=br.readLine();
                System.out.println(msgCli);
                switch (msgCli) {
                    case "1":
                        pw.println("Ajouter un client");
                        break;
                    case "2":
                        pw.println("Chercher un Client");
                        break;
                    case "3": 
                        pw.println("Afficher la liste des clients");
                        break;
                    case "4":
                        pw.println(listServices);
                    default:
                        break;
                }

            
               
             }

            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
