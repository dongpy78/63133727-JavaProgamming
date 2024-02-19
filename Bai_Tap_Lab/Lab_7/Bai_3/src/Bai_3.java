import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVienIT svIT = new SinhVienIT("Bui Van Dong", "IT", 5, 7, 8);
        SinhVienBinz svBZ = new SinhVienBinz("Thanh Ngan", "BIZ", 4, 7);
        svIT.xuat();
        svBZ.xuat();
        scanner.close();
    }
}
