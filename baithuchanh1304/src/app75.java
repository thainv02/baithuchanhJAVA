import GetterandSetter.HinhTron;
import staticVD.HinhChuNhat;
import staticVD.HinhHoc;

public class app75 {
    public static void main(String[] args) {
        // Tạo các thể hiện của các lớp
        HinhHoc hinhHoc = new HinhHoc();
        HinhTron hinhTron1 = new HinhTron();
        HinhTron hinhTron2 = new HinhTron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println("Có tất cả " + HinhHoc.dem + " hình trong ứng dụng");
    }
}
