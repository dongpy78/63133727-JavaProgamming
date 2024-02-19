import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Bai_4 {
    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public static void main(String[] args) {
        Bai_4 quanLy = new Bai_4();
        quanLy.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatSinhVienGioi();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("Diem: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line

            SinhVien sv = new SinhVien(hoTen, diem);
            danhSachSinhVien.add(sv);
        }

        System.out.println("Da nhap xong danh sach sinh vien.");
    }

    public void xuat() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println("Ho ten: " + sv.getHoTen() + ", Diem: " + sv.getDiem());
            }
        }
    }

    public void xuatSinhVienGioi() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien co hoc luc gioi:");
            for (SinhVien sv : danhSachSinhVien) {
                if (sv.getDiem() >= 9) {
                    System.out.println("Ho ten: " + sv.getHoTen() + ", Diem: " + sv.getDiem());
                }
            }
        }
    }

    public void sapXepTheoDiem() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            Collections.sort(danhSachSinhVien, Comparator.comparing(SinhVien::getDiem).reversed());
            System.out.println("Danh sach sinh vien sau khi sap xep theo diem giam dan:");
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println("Ho ten: " + sv.getHoTen() + ", Diem: " + sv.getDiem());
            }
        }
    }
}
