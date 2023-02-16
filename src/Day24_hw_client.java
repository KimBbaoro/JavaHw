import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Day24_hw_client {
    public static void main(String[] args) throws IOException { // 왜 여기서 throw?
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        try (Socket clientSocket = new Socket(ip, 9000);
             BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ){
            String output= br.readLine();
            System.out.println(output);

        }catch (Exception e) {
            System.out.println("오류내용");
        }


    }
}
