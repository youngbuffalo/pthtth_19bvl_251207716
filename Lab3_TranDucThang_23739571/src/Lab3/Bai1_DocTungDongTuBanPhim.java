package Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai1_DocTungDongTuBanPhim{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        System.out.print("Nhập văn bản (nhập q để kết thúc): ");

        try {
            while (true) {
                String line = reader.readLine();

                if (line == null || line.equalsIgnoreCase("q")) {
                    break;
                }

                count++;
                System.out.printf("Dòng %d: %s%n", count, line);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc dữ liệu! Lỗi: " + e.getMessage());
            return;
        }

        System.out.println("Tổng số dòng đã nhập: " + count);
    }
}

