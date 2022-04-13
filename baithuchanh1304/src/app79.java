import thuchanh.Configs;
import thuchanh.NhanVienFullTime;
import thuchanh.NhanVienPartTime;

public class app79 {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn văn A");
        NhanVienFullTime linh2 = new NhanVienFullTime("Nguyễn Văn B", 4);
        NhanVienPartTime thoiVu = new NhanVienPartTime("Nguyễn Văn C", 543);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}