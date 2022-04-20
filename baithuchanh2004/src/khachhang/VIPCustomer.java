package khachhang;

import java.util.Scanner;

import sinhvien.person;

public class VIPCustomer extends person {
    public String hovaten;
    public float sotiendamua;

    private void nhap() {
        System.out.println("nhập hovaten = ");
        Scanner scanner = new Scanner(System.in);
        hovaten = scanner.nextLine();
        System.out.println("nhập sotiendamua = ");
        sotiendamua = scanner.nextFloat();
    }
}
