package Bai5;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ChatServerImpl server = new ChatServerImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ChatService", server);

            System.out.println("Chat Server Dang Chay...");
            System.out.println("Dang cho Client Ket noi.");
        } catch (Exception e) {
            System.out.println("Server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
