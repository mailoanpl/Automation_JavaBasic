package QuanLySinhVien;

public class SinhVien {

    String ngaySinh = "20/12/2022";
    String khoa = "CNTT";


    public void getSinhVien() {

        String nameSV = "Hoàng";
        int tuoiSV = 30;
        String diachi = "Hà nội";
        String lop = "3BV";

        System.out.println("Họ và tên sv: " + nameSV);
        System.out.println("Tuổi sv: " + tuoiSV);
        System.out.println("Địa chỉ sv: " + diachi);
        System.out.println("Lớp học sv: " + lop);

    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();

        //Gọi biến cục bộ
        sv.getSinhVien();

        //Gọi biến toàn cục
        System.out.println("Ngày sinh: " + sv.ngaySinh);
        System.out.println("Khoa: " + sv.khoa);

        //Gọi biến static
        System.out.println("Liên khóa học: " + ThongTin.lienkhoa);
        System.out.println("Trường đại học: " + ThongTin.truong);

    }
}
