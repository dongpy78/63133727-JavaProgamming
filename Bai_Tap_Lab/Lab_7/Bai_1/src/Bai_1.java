/* Xây dựng lớp ChuNhat gồm 2 thuộc tính là rong và dai và các phương thức
getChuVi() và getDienTich() để tính chu vi và diện tích. Phương thức xuat() sẽ xuất
ra màn hình chiều rộng, chiều dài, diện tích và chu vi.
Xây dựng lớp Vuong kế thừa từ lớp ChuNhat và ghi đè phương thức xuat() để xuất
thông tin cạnh, diện tích và chu vi.
Viết chương trình nhập 2 hình chữ nhật và một hình vuông sau đó xuất ra màn
hình.
 */


import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double daiCN = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rongCN = scanner.nextDouble();
        System.out.print("Nhập cạnh hình vuông: ");
        double canhVuong = scanner.nextDouble();

        ChuNhat hcn1 = new ChuNhat(daiCN, rongCN);
        ChuNhat hcn2 = new ChuNhat(5, 4);
        Vuong hv1 = new Vuong(canhVuong);

        System.out.println("Thông tin hình chữ nhật 1: ");
        hcn1.xuat();
        System.out.println("Thông tin hình chữ nhật 2: ");
        hcn2.xuat();
        System.out.println("Thông tin hình vuông: ");
        hv1.xuat();
        scanner.close();
    }
}
