package sinhvien;

import java.util.Date;
import java.util.Scanner;

public class student extends person {
    public boolean gioitinh;
    public String quequan;
    public int namsinh;

    public void nhap() {
        System.out.println("nhập năm sinh = ");
        Scanner scanner = new Scanner(System.in);
        namsinh = scanner.nextInt();
    }

    public void tinhtuoi() {
        int tuoi = 2022 - namsinh;
        System.out.println(+tuoi);
    }
}
