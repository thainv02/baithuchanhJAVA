
import java.util.Scanner;

public class sinhvien {
    String MaSinhVien;
    String HoTen;
    boolean GioiTinh;
    String DiaChi;
    String NgaySinh;

    void NhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập MaSinhVien : ");
        MaSinhVien = scanner.nextLine();
        System.out.println("nhập HoTen : ");
        HoTen = scanner.nextLine();
        System.out.println("nhập GioiTinh : ");
        GioiTinh = scanner.nextBoolean();
        System.out.println("nhập DiaChi : ");
        DiaChi = scanner.nextLine();
        System.out.println("nhập NgaySinh : ");
        NgaySinh = scanner.nextLine();
    }

    void InthongtinSV() {
        System.out.println("MaSinhVien là: " + MaSinhVien);
        System.out.println("HoTen là: " + HoTen);
        System.out.println("GioiTinh là: " + GioiTinh);
        System.out.println("DiaChi là: " + DiaChi);
        System.out.println("NgaySinh là: " + NgaySinh);
    }
}
