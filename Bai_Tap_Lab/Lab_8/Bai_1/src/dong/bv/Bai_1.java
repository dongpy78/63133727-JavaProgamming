package dong.bv;

public class Bai_1 {

	public static final double sum(double... x) {
        double total = 0;
        for(double value : x) {
            total += value;
        }
        return total;
    }
    public static void main(String[] args) throws Exception {
        double ket_qua = Bai_1.sum(1.5, 2.5, 3.0, 5.5);
        System.out.print("Tổng các tham số là: " + ket_qua);
    }

}
