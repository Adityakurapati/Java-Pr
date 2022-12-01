import java.awt.LayoutManager;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
// import java.io.*;
class Practical12{
    // Practical12()throws UnknownHostException{
    //     setVisible(true);
    //     setSize(500,500);
    //     setLayout(new FlowLayout());
    //     JTextPane p = new JTextPane();
    //     JTextField f = new JTextField("Enter Host Name : ");
    //     add(p);add(f);
    //     JButton b = new JButton("Get Host");
    //     b.addActionListener(new ActionListener(){
    //         public void actionPerformed(ActionEvent e){
    //             InetAddress i;
    //             try {
    //                 i = InetAddress.getByName(f.getText());
    //             } catch (UnknownHostException e1) {
    //                 // TODO Auto-generated catch block
    //                 e1.printStackTrace();
    //             }
    //             System.out.println("Host Address : "+i.getHostAddress());
    //             System.out.println("Host Name : "+i.getHostAddress());
    //         }
    //     });
    // }
    public static void main(String a[])throws Exception{
        InetAddress i= InetAddress.getByName(new Scanner(System.in).next());
        System.out.println("IP : "+i);
        
    }
}