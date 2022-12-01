import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Practical16Server {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(3030);
        Socket s = ss.accept();
        DataInputStream i = new DataInputStream(s.getInputStream());
        DataOutputStream o = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            if(i.readUTF().length()>0){
                System.out.println("Client : ");
                System.out.println(i.readUTF());
            }
            else{
                System.out.println("Server : ");
                String msg = br.readLine();
                o.writeUTF(msg);
            }
        }
    }   
}
