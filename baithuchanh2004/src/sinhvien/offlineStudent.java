package sinhvien;

import java.util.Scanner;

public class offlineStudent extends student {
    public int chieucao;

    public void nhap() {
        System.out.println("nhập chieucao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("sinh viên có chiều cao là: " + chieucao);
    }
}
