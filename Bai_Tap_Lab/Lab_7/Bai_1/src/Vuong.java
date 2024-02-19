class Vuong extends ChuNhat {
  public Vuong(double canh) {
    super(canh, canh);
  }
  @Override
  public void xuat() {
    System.out.print("Cạnh: " + rong);
    System.out.print("Chu vi: " + getChuVi());
    System.out.print("Diện tích: " + getDienTich());
  }
}
