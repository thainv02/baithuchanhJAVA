import GetterandSetter.SinhVien;

public class app72 {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng sinhVien
        SinhVien sinhvien1 = new SinhVien();
        SinhVien sinhvien2 = new SinhVien();
        // Set thông tin vào cho các sinh viên
        sinhvien1.setTen(""); // Tên không có
        sinhvien1.setTuoi(23);
        sinhvien2.setTen("Peter");
        sinhvien2.setTuoi(17);
        // In thông tin các sinh viên
        System.out.println("Sinh viên 1 có tên:" + sinhvien1.getTen() + "Tuổi là" + sinhvien1.getTuoi());
        System.out.println("Sinh viên 1 có tên:" + sinhvien2.getTen() + "Tuổi là" + sinhvien2.getTuoi());
    }
}
