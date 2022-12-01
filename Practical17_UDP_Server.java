import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Practical17_UDP_Server {
    private static final byte[] DatagramPacket = null;

    public static void main(String[] args) throws IOException{
        int s=20,c=10;
        DatagramSocket socket= new DatagramSocket(3000);
        byte buffer[]=new byte[5000],bufferS[]=new byte[5000];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress ip = InetAddress.getByName("localhost");
        while(true){
            System.out.println("Client ");
            DatagramPacket pkt2 = new DatagramPacket(buffer,buffer.length);
            socket.receive(pkt2);
            String m = new String(pkt2.getData(),0,pkt2.getLength());
            System.out.println(m);
            
            System.out.println("Server ");
            String msg = br.readLine();
            bufferS = msg.getBytes();
            DatagramPacket pkt = new DatagramPacket(bufferS,msg.length(),ip,c);
            socket.send(pkt);
            
        }
    }
}
