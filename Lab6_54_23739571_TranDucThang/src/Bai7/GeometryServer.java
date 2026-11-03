package Bai7;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GeometryServer {

    public static void main(String[] args) {
        try {
            GeometryServerImpl server =
                    new GeometryServerImpl();

            Registry registry =
                    LocateRegistry.createRegistry(1099);

            registry.rebind("GeometryService", server);

            System.out.println("Geometry Server dang chay...");
            System.out.println("Dang cho Client ket noi.");

        } catch (Exception e) {
            System.out.println("Loi Server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}