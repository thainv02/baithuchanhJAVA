package sinhvien;

import java.util.Scanner;

public class person {
    private int ID;
    private String name;

    private void nhap() {
        System.out.println("nhập ID = ");
        Scanner scanner = new Scanner(System.in);
        ID = scanner.nextInt();
        System.out.println("nhập name = ");
        name = scanner.nextLine();
    }

    private void xuat() {
        System.out.println("ID là : " + ID);
        System.out.println("Tên là : " + name);
    }

}
