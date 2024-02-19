public class ChuNhat {
  protected double dai;
  protected double rong;
  
  public ChuNhat(double dai, double rong) {
    this.dai = dai;
    this.rong = rong;    
  }

  public double getChuVi() {
    return (dai + rong)*2;
  }
  public double getDienTich() {
    return dai*rong;
  }

  public void xuat() {
    System.out.println("Chiều dài: " + dai);
    System.out.println("Chiều rộng: " + rong);
    System.out.println("Diện tích: " + getDienTich());
    System.out.println("Chu vi: " + getChuVi());
  }
}
