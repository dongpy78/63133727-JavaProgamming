class SinhVienExemple extends SinhVienPoly {
  private double diem;
  public SinhVienExemple(String hoTen, String nganh, double diem) {
    super(hoTen, nganh);
    this.diem = diem;
  }
  @Override
  public double getDiem() {
    return diem;
  }
}
