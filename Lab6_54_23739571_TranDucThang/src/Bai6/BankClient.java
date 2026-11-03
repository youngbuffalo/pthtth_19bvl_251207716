package Bai6;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class BankClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            BankInterface bank = (BankInterface) registry.lookup("BankService");
            Scanner sc = new Scanner(System.in);

            int choice;
            do {
                System.out.println("\n===== QUAN LY TAI KHOAN NGAN HANG =====");
                System.out.println("1. Xem so du");
                System.out.println("2. Gui tien");
                System.out.println("3. Rut tien");
                System.out.println("0. Thoat");
                System.out.print("Chon chuc nang: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("So du hien tai:"+ bank.getBalance()+ "VND" );
                        break;

                    case 2:
                        System.out.print("Nhap so tien muon gui: ");
                        double depositAmount = sc.nextDouble();

                        if (depositAmount <= 0) {
                            System.out.println("So tien gui phai lon hon 0.");
                        } else {
                            bank.deposit(depositAmount);
                            System.out.println("Gui tien thanh cong!");
                            System.out.println("So du moi:"+ bank.getBalance()+ "VND" );
                        }
                        break;

                    case 3:
                        System.out.print("Nhap so tien muon rut: ");
                        double withdrawAmount = sc.nextDouble();

                        if (bank.withdraw(withdrawAmount)) {
                            System.out.println("Rut tien thanh cong!");
                        } else {
                            System.out.println("Rut tien that bai! So tien khong hop le hoac so du khong du.");
                        }
                        System.out.println("So du hien tai:"+ bank.getBalance()+ "VND" );
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
