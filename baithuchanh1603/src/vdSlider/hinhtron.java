package vdSlider;

import java.util.Scanner;

public class hinhtron {
    final float PI = 3.14f;
    float r;
    float CV;
    float DT;

    void nhapBanKinh() {
        System.out.println("nhập bán kính hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    void chuVi() {
        CV = 2 * r * PI;
    }

    void dienTich() {
        DT = PI * r * r;
    }

    void InChuVi() {
        System.out.println("chu vi hình tròn là : " + CV);
    }

    void InDienTich() {
        System.out.println("diện tích hình tròn là : " + DT);
    }

}
