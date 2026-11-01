package bai3;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            SoNguyenToImpl obj = new SoNguyenToImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("SoNguyenTo", obj);

            System.out.println("Server dang chay...");
            System.out.println("Dang cho Client ket noi!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
