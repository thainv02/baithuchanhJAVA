package shapes;

import java.util.Scanner;

public class hinhtron extends hinhhoc {

    public float bankinh;

    // Constructor
    public hinhtron() {
        ten = "Hình Tròn";
    }

    public void nhapBankinh() {
        System.out.println("Bán kính = ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * bankinh;
    }

    public void tinhDienTich() {
        dienTich = PI * bankinh * bankinh;
    }
}
