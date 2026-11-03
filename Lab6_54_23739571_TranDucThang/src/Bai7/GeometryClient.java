package Bai7;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class GeometryClient {

    public static void main(String[] args) {
        try {
            Registry registry =
                    LocateRegistry.getRegistry("localhost", 1099);

            GeometryInterface geometry =
                    (GeometryInterface) registry.lookup("GeometryService");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== TINH DIEN TICH HINH HOC =====");
                System.out.println("1. Hinh chu nhat");
                System.out.println("2. Hinh tron");
                System.out.println("3. Hinh tam giac");
                System.out.println("0. Thoat");
                System.out.print("Chon chuc nang: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Nhap chieu dai: ");
                        double width = sc.nextDouble();

                        System.out.print("Nhap chieu rong: ");
                        double height = sc.nextDouble();

                        double rectangle =
                                geometry.rectangleArea(width, height);

                        System.out.println("Dien tich hinh chu nhat: "
                                + rectangle);
                        break;

                    case 2:
                        System.out.print("Nhap ban kinh: ");
                        double radius = sc.nextDouble();

                        double circle =
                                geometry.circleArea(radius);

                        System.out.println("Dien tich hinh tron: "
                                + circle);
                        break;

                    case 3:
                        System.out.print("Nhap canh day: ");
                        double base = sc.nextDouble();

                        System.out.print("Nhap chieu cao: ");
                        double triangleHeight = sc.nextDouble();

                        double triangle =
                                geometry.triangleArea(base, triangleHeight);

                        System.out.println("Dien tich hinh tam giac: "
                                + triangle);
                        break;

                    case 0:
                        System.out.println("Da thoat chuong trinh.");
                        break;

                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            } while (choice != 0);

            sc.close();

        } catch (Exception e) {
            System.out.println("Loi Client: " + e.getMessage());
            e.printStackTrace();
        }
    }
}