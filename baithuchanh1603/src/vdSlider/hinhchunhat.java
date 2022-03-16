package vdSlider;

import java.util.Scanner;

public class hinhchunhat {
    float chieuRong;
    float ChieuDai;
    float CV;
    float DT;

    void nhapChieuRong() {
        System.out.println("nhập chiều rộng hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        chieuRong = scanner.nextFloat();
    }

    void nhapChieuDai() {
        System.out.println("nhập chiều dai hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        ChieuDai = scanner.nextFloat();
    }

    void chuVi() {
        CV = (chieuRong + ChieuDai) * 2;
    }

    void dienTich() {
        DT = chieuRong * ChieuDai;
    }

    void InChuVi() {
        System.out.println("chu vi hình chữ nhật là : " + CV);
    }

    void InDienTich() {
        System.out.println("diện tích hình chữ nhật là : " + DT);
    }
}
