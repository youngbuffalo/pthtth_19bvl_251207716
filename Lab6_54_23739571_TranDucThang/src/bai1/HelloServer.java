package bai1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
           
            HelloImpl obj = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("HelloService", obj);

            System.out.println("RMI Server is running...");
            System.out.println("Waiting for client...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}