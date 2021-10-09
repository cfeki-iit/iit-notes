import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main (String[] args){
        System.out.println("Le client établit la connexion");
        try{
            Socket s = new Socket("localhost",1234);
            System.out.println("Je Suis connecté");
            
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            System.out.println("Le client envoie un nombre : 23");
            os.write(23);
            System.out.println("le Client attend la réponse du serveur");
            int res = is.read();
            System.out.println("le serveur a envoyé au client le résultat suivant: "+res);
            s.close();
        }
        catch(UnknownHostException e ){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
