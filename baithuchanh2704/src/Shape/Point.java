package Shape;

import java.util.Scanner;

public class Point {
    private String tendiem;
    private float hoanhdo;
    protected float tungdo;

    public String gettendiem() {
        return tendiem;
    }

    public float gethoanhdo() {
        return hoanhdo;
    }

    public float gettungdo() {
        return tungdo;
    }

    public void settendiem(String tendiem) {
        this.tendiem = tendiem;
    }

    public void sethoanhdo(Float hoanhdo) {
        this.hoanhdo = hoanhdo;
    }

    public void settungdo(Float tungdo) {
        this.tungdo = tungdo;
    }

    public Point(String tendiem) {
        this.tendiem = tendiem; // Gán biến tendiem vào thuộc tính tendiem
    }

    public Point(float hoanhdo) {
        this.hoanhdo = hoanhdo;
    }

    public Point(Float tungdo) {
        this.tungdo = tungdo; // Gán biến tungdo vào thuộc tính tungdo
    }

    public Point() {
    }

    public void nhap() {
        System.out.println("nhập lần lượt tên điểm, tung độ và hoành độ của điểm ");
        Scanner scanner = new Scanner(System.in);
        tendiem = scanner.next();
        tungdo = scanner.nextFloat();
        hoanhdo = scanner.nextFloat();
    }

    public void in() {
        System.out.println("" + tendiem + "(" + hoanhdo + "," + tungdo + ")");
    }

    public void settendiem() {
    }

    public void sethoanhdo() {
    }

    public void settungdo() {
    }
}
