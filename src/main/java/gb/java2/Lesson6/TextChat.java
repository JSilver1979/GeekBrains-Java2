package gb.java2.Lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TextChat {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    private final int PORT = 7070;
    private Scanner inClient;
    private Scanner inServer;
    private PrintWriter out;
    private String str = "";

    public TextChat() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server started at " + serverSocket.getLocalSocketAddress());
            clientSocket = serverSocket.accept();
            System.out.println("Client connected at " + clientSocket.getRemoteSocketAddress());

            inClient = new Scanner(clientSocket.getInputStream());
            inServer = new Scanner(System.in);
            out = new PrintWriter(clientSocket.getOutputStream(), true);

             new Thread(() -> {
                while (true) {
                    if (str.equals("/end")) break;

                    String serverString = inServer.nextLine();
                    out.println("Server: " + serverString + "\n");


                }
            }).start();
            while (true) {

                str = inClient.nextLine();
                System.out.println("Client: " + str);
                out.println("You: " + str);

                if (str.equals("/end")) {
                    break;

                };

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Client disconnected.");
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
