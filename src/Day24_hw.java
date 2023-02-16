import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Day24_hw {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(9000);
            Socket clientSocket =serverSocket.accept();
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            pw.println(new Date().toString());

        }catch (Exception e) {
            System.out.println("뭐가 안되는거지");

        }
    }
}
