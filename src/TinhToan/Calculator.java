package TinhToan;

public class Calculator {


    public static int tong2songuyen(int a, int b) {
        return a + b;
    }

    public  static double tich2sothuc(double n, double m){
        return n * m;
    }

    public static void main(String[] args) {

        System.out.println("Tổng 2 số nguyên bằng: "+ Calculator.tong2songuyen(11, 23));
        System.out.println("Tích 2 số thực bằng: "+ Calculator.tich2sothuc(23.9, 40));
    }
}
