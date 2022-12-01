import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStreamReader;
public class Practical16Client {
 public static void main(String a[])throws SocketException,UnknownHostException,IOException{
   Socket s = new Socket("127.0.0.1",3030);
   DataOutputStream out = new DataOutputStream(s.getOutputStream());
   DataInputStream in = new DataInputStream(s.getInputStream());
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   while(true){
    System.out.println("Client  ");
    String msg = br.readLine();
    out.writeUTF(msg);

    if(in.readUTF().length()>0){
        System.out.println("Server : ");
        System.out.println(in.readUTF());
    }
    if(msg.equalsIgnoreCase("bye")){
        break;
    }
   }
 }   
}
