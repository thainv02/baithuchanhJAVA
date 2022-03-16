
public class main {
    public static void main(String[] args) throws Exception {
        person person = new person();
        sinhvien sinhvien = new sinhvien();
        giaiphuongtrinhb2 phuongTrinhBacHai = new giaiphuongtrinhb2();
        person.nhap();
        person.Inthongtin();
        sinhvien.NhapThongTin();
        sinhvien.InthongtinSV();
        phuongTrinhBacHai.Nhap();
        phuongTrinhBacHai.giaiphuongtrinh();
    }
}
