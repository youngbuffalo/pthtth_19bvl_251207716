package Bai6;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankServer {
    public static void main(String[] args) {
        try {
            double initialBalance = 1000000;
            BankServerImpl server = new BankServerImpl(initialBalance);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("BankService", server);

            System.out.println("Bank Server dang chay...");
            System.out.println("So du ban dau: " + initialBalance + " VND");
        } catch (Exception e) {
            System.out.println("Loi Server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
