package Bai5;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ChatInterface chat = (ChatInterface) registry.lookup("ChatService");

            Scanner sc = new Scanner(System.in);
            System.out.println("Dang ket no Server.");
            System.out.println("Nhap 'exit' de thoat.");

            while (true) {
                System.out.print("Client: ");
                String message = sc.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                chat.sendMessage(message);
                System.out.println(chat.getResponse());
            }

            sc.close();
            System.out.println("Client dang ket noi.");
        } catch (Exception e) {
            System.out.println("Client: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
