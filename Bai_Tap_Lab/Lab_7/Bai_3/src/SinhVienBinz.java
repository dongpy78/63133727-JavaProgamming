public class SinhVienBinz extends SinhVienPoly {
  private double diemMark;
  private double diemSale;

  public SinhVienBinz(String hoTen, String nganh, double diemMark, double diemSale) {
    super(hoTen, "Biz");
    this.diemMark = diemMark;
    this.diemSale = diemSale;
  }

  @Override
  public double getDiem() {
    return (2*diemMark+diemSale)/3;
  }
}
