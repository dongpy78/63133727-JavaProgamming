package dong.bv;

public class Bai_2 {

	 public static final double sum(double... x) {
	        double total = 0;
	        for(double value : x) {
	            total += value;
	        }
	        return total;
	    }

	    public static final double min(double... x) {
	        if (x.length == 0) {
	            throw new IllegalArgumentException("Danh sach khong co phan tu nao.");
	        }

	        double minValue = x[0];

	        for (double value : x) {
	            if (value < minValue) {
	                minValue = value;
	            }
	        }

	        return minValue;
	    }

	    public static final double max(double... x) {
	        if (x.length == 0) {
	            throw new IllegalArgumentException("Danh sach khong co phan tu nao.");
	        }

	        double maxValue = x[0];

	        for (double value : x) {
	            if (value > maxValue) {
	                maxValue = value;
	            }
	        }

	        return maxValue;
	    }

	    public static void main(String[] args) throws Exception {
	        // Gọi phương thức min và max từ lớp XPoly
	        double minResult = Bai_2.min(1.5, 2.5, 3.0, 4.2);
	        double maxResult = Bai_2.max(1.5, 2.5, 3.0, 4.2);

	        System.out.println("So nho nhat: " + minResult);
	        System.out.println("So lon nhat: " + maxResult);
	    }

}
