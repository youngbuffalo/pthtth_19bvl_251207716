package Lab3;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Path;

	public class Bai2_TaoThuMucDATA {
	    public static void main(String[] args) {
	        Path dir = Path.of("data");
	        Path file = dir.resolve("ghi_chu.txt");
	        try {
	            Files.createDirectories(dir); 
	            try (BufferedWriter writer = Files.newBufferedWriter(
	                    file, StandardCharsets.UTF_8)) {

	                writer.write("Xin chào, đây là dòng 1!");
	                writer.newLine();
	                writer.write("Hôm nay em học Java.");
	                writer.newLine();
	                writer.write("Lập trình đọc/ghi file rất hữu ích.");
	                writer.newLine();
	            }
	            try (BufferedReader reader = Files.newBufferedReader(
	                    file, StandardCharsets.UTF_8)) {

	                String line;
	                int index = 1;
	                while ((line = reader.readLine()) != null) {
	                    System.out.printf("%d. %s%n", index, line);
	                    index++;
	                }
	            }

	        } catch (IOException e) {
	            System.err.println("Lỗi khi xử lý file: " + e.getMessage());
	        }
	    }
	}
