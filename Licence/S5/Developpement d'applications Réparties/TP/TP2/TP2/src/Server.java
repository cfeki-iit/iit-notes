import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main (String[] args ){
        try{
            ServerSocket ss = new ServerSocket(1234);

            System.out.println("J\'attend une connexion");
            Socket s = ss.accept();

            System.out.println("J\'accepte la connexion du client");
            
            InputStream is = s.getInputStream();
            OutputStream os= s.getOutputStream();
            
            System.out.println("j\'attend la requete du client");
            int req=is.read();
            System.out.println("J\'ai bien reçu la requete : "+req);

            int res = req*2;
            os.write(res);

            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
