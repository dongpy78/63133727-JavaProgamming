/* Tạo lớp SinhVienPoly gồm 2 thuộc tính họ tên và ngành cùng với phương thức
trừu tượng là getDiem(). Thêm phương thức getHocLuc() để xếp loại học lực. Lớp
cũng bao gồm một phương thức xuat() để xuất họ tên, ngành, điểm và học lực ra
màn hình. */

public class Bai_2 {
    public static void main(String[] args)  {
        SinhVienPoly sv = new SinhVienExemple("Bui Van Dong", "CNTT", 8.9);
        sv.xuat();
    }
}
