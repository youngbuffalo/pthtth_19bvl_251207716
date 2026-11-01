package bai4;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry =
                    LocateRegistry.getRegistry("localhost", 1099);

            DanhBa danhBa =
                    (DanhBa) registry.lookup("DanhBa");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== QUAN LY DANH BA =====");
                System.out.println("1. Them lien he");
                System.out.println("2. Sua so dien thoai");
                System.out.println("3. Xoa lien he");
                System.out.println("4. Tim kiem lien he");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Nhap ten: ");
                        String nameAdd = sc.nextLine();

                        System.out.print("Nhap so dien thoai: ");
                        String phoneAdd = sc.nextLine();

                        danhBa.addContact(nameAdd, phoneAdd);
                        System.out.println("Them lien he thanh cong!");
                        break;

                    case 2:
                        System.out.print("Nhap ten can sua: ");
                        String nameUpdate = sc.nextLine();

                        System.out.print("Nhap so dien thoai moi: ");
                        String newPhone = sc.nextLine();

                        if (danhBa.updateContact(nameUpdate, newPhone)) {
                            System.out.println("Cap nhat thanh cong!");
                        } else {
                            System.out.println("Khong tim thay lien he!");
                        }
                        break;

                    case 3:
                        System.out.print("Nhap ten can xoa: ");
                        String nameDelete = sc.nextLine();

                        if (danhBa.deleteContact(nameDelete)) {
                            System.out.println("Xoa lien he thanh cong!");
                        } else {
                            System.out.println("Khong tim thay lien he!");
                        }
                        break;

                    case 4:
                        System.out.print("Nhap ten can tim: ");
                        String nameFind = sc.nextLine();

                        String phone = danhBa.findContact(nameFind);

                        if (phone != null) {
                            System.out.println("Ten: " + nameFind);
                            System.out.println("So dien thoai: " + phone);
                        } else {
                            System.out.println("Khong tim thay lien he!");
                        }
                        break;

                    case 0:
                        System.out.println("Ket thuc chuong trinh!");
                        break;

                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            } while (choice != 0);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
