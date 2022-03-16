package vdSlider;

public class main {
    public static void main(String[] args) throws Exception {
        hinhtron ht = new hinhtron();
        hinhchunhat hcn = new hinhchunhat();
        ht.nhapBanKinh();
        ht.chuVi();
        ht.dienTich();
        ht.InChuVi();
        ht.InDienTich();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.chuVi();
        hcn.dienTich();
        hcn.InChuVi();
        hcn.InDienTich();
    }
}
