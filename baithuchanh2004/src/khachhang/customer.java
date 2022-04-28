package khachhang;

import java.util.Scanner;

import sinhvien.person;

public class customer extends person {
    public int solanmuahang;

    public void nhap1() {
        System.out.println("nhập số lần mua hàng = ");
        Scanner scanner = new Scanner(System.in);
        solanmuahang = scanner.nextInt();
    }

}
