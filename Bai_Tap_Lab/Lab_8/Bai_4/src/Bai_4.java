
public class Bai_4 {

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

	    public static final String toUpperFirstChar(String s) {
	        if (s == null || s.isEmpty()) {
	            return s;
	        }

	        String[] words = s.split(" ");

	        for (int i = 0; i < words.length; i++) {
	            if (!words[i].isEmpty()) {
	                char firstChar = words[i].charAt(0);
	                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
	                words[i] = upperFirstChar + words[i].substring(1);
	            }
	        }

	        return String.join(" ", words);
	    }

	    public static void main(String[] args) throws Exception {
	       // Sử dụng phương thức sum()
	       double sumResult = Bai_4.sum(1.5, 2.5, 3.0, 4.2);
	       System.out.println("Tong cac tham so: " + sumResult);

	       // Sử dụng phương thức min() và max()
	       double minResult = Bai_4.min(1.5, 2.5, 3.0, 4.2);
	       double maxResult = Bai_4.max(1.5, 2.5, 3.0, 4.2);

	       System.out.println("So nho nhat: " + minResult);
	       System.out.println("So lon nhat: " + maxResult);

	       // Sử dụng phương thức toUpperFirstChar()
	       String upperFirstCharResult = Bai_4.toUpperFirstChar("nguyen van teo");
	       System.out.println("Chuoi sau khi chuyen doi: " + upperFirstCharResult);
	    }

}
