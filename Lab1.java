package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. In Hello World");
        System.out.println("2. In ten va cau chao");
        System.out.println("3. Tinh tong A + B");
        System.out.println("4. Tim chan le");
        System.out.println("5. Tim ten thang bang tieng anh");
        System.out.println("6. Quan ly so thu");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.println("Hello World");
                break;

            case 2:
                System.out.print("Nhap ten ban: ");
                String ten = sc.nextLine();

                System.out.println("Ten ban la: " + ten);
                System.out.println("Hi, I am = " + ten);
                break;

            case 3:
                System.out.print("Nhap A: ");
                double A = sc.nextDouble();

                System.out.print("Nhap B: ");
                double B = sc.nextDouble();

                double tong = A + B;
                System.out.println("Tong A + B = " + tong);
                break;
            case 4:
                System.out.print("Nhap mot so: ");
                int n = sc.nextInt();

                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break;
            case 5:
                System.out.print("Nhap thang: ");
                String thang = sc.nextLine().toLowerCase();

                switch (thang) {
                    case "thang mot":
                    case "tháng một":
                    case "thang 1":
                    case "tháng 1":
                    case "1":
                        System.out.println("January");
                        break;

                    case "thang hai":
                    case "tháng hai":
                    case "thang 2":
                    case "tháng 2":
                    case "2":
                        System.out.println("February");
                        break;

                    case "thang ba":
                    case "tháng ba":
                    case "thang 3":
                    case "tháng 3":
                    case "3":
                        System.out.println("March");
                        break;

                    case "thang tu":
                    case "tháng tư":
                    case "thang 4":
                    case "tháng 4":
                    case "4":
                        System.out.println("April");
                        break;

                    case "thang nam":
                    case "tháng năm":
case "thang 5":
                    case "tháng 5":
                    case "5":
                        System.out.println("May");
                        break;

                    case "thang sau":
                    case "tháng sáu":
                    case "thang 6":
                    case "tháng 6":
                    case "6":
                        System.out.println("June");
                        break;

                    case "thang bay":
                    case "tháng bảy":
                    case "thang 7":
                    case "tháng 7":
                    case "7":
                        System.out.println("July");
                        break;

                    case "thang tam":
                    case "tháng tám":
                    case "thang 8":
                    case "tháng 8":
                    case "8":
                        System.out.println("August");
                        break;

                    case "thang chin":
                    case "tháng chín":
                    case "thang 9":
                    case "tháng 9":
                    case "9":
                        System.out.println("September");
                        break;

                    case "thang muoi":
                    case "tháng mười":
                    case "thang 10":
                    case "tháng 10":
                    case "10":
                        System.out.println("October");
                        break;

                    case "thang muoi mot":
                    case "tháng mười một":
                    case "thang 11":
                    case "tháng 11":
                    case "11":
                        System.out.println("November");
                        break;

                    case "thang muoi hai":
                    case "tháng mười hai":
                    case "thang 12":
                    case "tháng 12":
                    case "12":
                        System.out.println("December");
                        break;

                    default:
                        System.out.println("Thang khong hop le!");
                }
                break;

            case 6:
                System.out.println("===== QUAN LY VUON THU =====");

                
                System.out.print("Nhap ten Su Tu: ");
                String tenSuTu = sc.nextLine();

                System.out.print("Nhap can nang Su Tu (kg): ");
                double canNangSuTu = sc.nextDouble();

                System.out.print("Su Tu an bao nhieu kg thuc an: ");
                double thucAnSuTu = sc.nextDouble();
                sc.nextLine();

                
                System.out.print("Nhap ten Ran: ");
                String tenRan = sc.nextLine();

                System.out.print("Nhap can nang Ran (kg): ");
                double canNangRan = sc.nextDouble();
System.out.print("Nhap chieu dai Ran (m): ");
                double chieuDaiRan = sc.nextDouble();
                sc.nextLine();

               
                System.out.print("Nhap ten Khi: ");
                String tenKhi = sc.nextLine();

                System.out.print("Nhap can nang Khi (kg): ");
                double canNangKhi = sc.nextDouble();
                sc.nextLine();

                System.out.print("Nhap thuc an yeu thich cua Khi: ");
                String thucAnKhi = sc.nextLine();

                
                System.out.println("\n===== THONG TIN VUON THU =====");

                System.out.println("\nSu Tu:");
                System.out.println("Ten loai: " + tenSuTu);
                System.out.println("Can nang: " + canNangSuTu + " kg");
                System.out.println("An: " + thucAnSuTu + " kg thuc an");

                System.out.println("\nRan:");
                System.out.println("Ten loai: " + tenRan);
                System.out.println("Can nang: " + canNangRan + " kg");
                System.out.println("Chieu dai: " + chieuDaiRan + " m");

                System.out.println("\nKhi:");
                System.out.println("Ten loai: " + tenKhi);
                System.out.println("Can nang: " + canNangKhi + " kg");
                System.out.println("Thuc an yeu thich: " + thucAnKhi);

                break;

            case 0:
                System.out.println("Thoat chuong trinh!");
                break;

            default:
                System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}
