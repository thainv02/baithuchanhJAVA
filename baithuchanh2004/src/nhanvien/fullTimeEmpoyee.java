package nhanvien;

import java.util.Scanner;

public class fullTimeEmpoyee extends Employee {
    public String phuongtien;

    public void nhap() {
        System.out.println("nhập tên phuong tiện = ");
        Scanner scanner = new Scanner(System.in);
        phuongtien = scanner.nextLine();
    }
}
