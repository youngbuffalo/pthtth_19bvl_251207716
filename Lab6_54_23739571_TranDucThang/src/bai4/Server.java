
package bai4;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            DanhBaImpl obj = new DanhBaImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("DanhBa", obj);

            System.out.println("Server danh ba dang chay...");
            System.out.println("Dang cho Client ket noi!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
