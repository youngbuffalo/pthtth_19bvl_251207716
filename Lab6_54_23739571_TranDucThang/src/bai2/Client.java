package bai2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Registry registry =
                LocateRegistry.getRegistry("localhost", 1099);

            TinhTong obj =
                (TinhTong) registry.lookup("TinhTong");

            System.out.print("Nhap so a: ");
            int a = sc.nextInt();

            System.out.print("Nhap so b: ");
            int b = sc.nextInt();

            int kq = obj.add(a, b);

            System.out.println("Tong hai so la: " + kq);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}