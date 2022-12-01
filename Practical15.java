import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.lang.String;
class Practical15{
    public static void main(String a[]) throws IOException,ClassNotFoundException{
        // Pr Question
        URL u = new URL("https://www.javatpoint.com/javafx-tutorial");
        URLConnection url = u.openConnection();
        System.out.print(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getPath());
        System.out.println(u.getFile());
        System.out.println(u.getProtocol());
        System.out.println(u.getAuthority());
        System.out.println(u.getContent());
        System.out.println(u.toExternalForm());
        System.out.println("");

        // Ex1 
        URL u2 = new URL("http://www.msbte.org.in");
        URLConnection url2 = u2.openConnection();
        System.out.print(u2.getPort());
        System.out.println(u2.getHost());
        System.out.println(u2.getPath());
        System.out.println(u2.getFile());

        // Ex2 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        URL mainUrl = new URL(str);
        URLConnection conn = mainUrl.openConnection();
        System.out.println(conn.getContentType());
        System.out.println(conn.getExpiration());
        System.out.println(conn.getDate());
        int len = conn.getContentLength();
        String data = (String) conn.getContent();
        int c;
        InputStream i = conn.getInputStream();
        if(!(len>0)){
            System.out.println("No Data Is Present ...");
        }else{
            while((c=i.read()) != -1){
                System.out.println((char)c);
            }
        }
    }
}