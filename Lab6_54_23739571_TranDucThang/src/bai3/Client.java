package bai3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Registry registry =
                    LocateRegistry.getRegistry("localhost", 1099);

            SoNguyenTo obj =
                    (SoNguyenTo) registry.lookup("SoNguyenTo");

            System.out.print("Nhap so nguyen n: ");
            int n = sc.nextInt();

            boolean kq = obj.isPrime(n);

            if (kq) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
