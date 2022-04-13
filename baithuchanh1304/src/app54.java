import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;
import shapes.hinhvuong;

public class app54 {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        hinhtron hinhTron = new hinhtron();
        hinhTron.xuatTen();
        hinhTron.nhapBankinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inDienTich();
        // Thử nghiệm với lớp Hình trụ
        hinhtru hinhTru = new hinhtru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
        // Thử nghiệm với lớp Hinh chữ nhật
        hinhchunhat hinhChuNhat = new hinhchunhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
        // Thứ nghiệm với lớp Hình vuông
        hinhvuong hinhvuong = new hinhvuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }
}
