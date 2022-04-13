package shapes;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieucao;

    // Constructor
    public hinhtru() {
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieucao;
    }
}