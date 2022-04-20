package nhanvien;

import java.util.Scanner;

import sinhvien.person;

public class Employee extends person {
    public int maphong;
    public String congviec;

    public void nhap() {
        System.out.println("nhập mã phòng = ");
        Scanner scanner = new Scanner(System.in);
        maphong = scanner.nextInt();
    }
}
