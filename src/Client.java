import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) /*throws IOException*/{
        try{
            Socket s = new Socket("127.0.0.1", 7777);
            BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        
            while(true){
                sock_out.println(std_in.readLine());
                System.out.println(sock_in.readLine());
            }
        }catch(Exception e){System.exit(0);}
    }
}
