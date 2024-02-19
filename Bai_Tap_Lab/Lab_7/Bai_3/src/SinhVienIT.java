public class SinhVienIT extends SinhVienPoly {
  private double diemJava;
  private double diemCss;
  private double diemHtml;

  public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
    super(hoTen, "IT");
    this.diemJava = diemJava;
    this.diemCss = diemCss;
    this.diemHtml = diemHtml;
  }

  @Override
  public double getDiem() {
    return (2*diemJava + diemHtml + diemCss) / 4;
  }
}
