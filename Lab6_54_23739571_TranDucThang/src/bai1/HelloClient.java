package bai1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try {
            
            Registry registry =
                LocateRegistry.getRegistry("localhost", 1099);

        
            HelloInterface obj =
                (HelloInterface) registry.lookup("HelloService");

           
            String result = obj.sayHello();

           
            System.out.println("Server response: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}