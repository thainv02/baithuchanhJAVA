package nhanvien;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    public int songaylamviec;
    public float luong;

    public void nhapsongaylv() {
        System.out.println("nhập số ngày lv = ");
        Scanner scanner = new Scanner(System.in);
        songaylamviec = scanner.nextInt();
    }

    public void tienluong() {
        luong = songaylamviec * 2000;
        System.out.println("lương = " + luong);
    }
}
