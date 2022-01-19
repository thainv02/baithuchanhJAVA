import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // khai báo biến
        double hesoA, hesoB, hesoC, Delta, nghiemx1, nghiemx2, nghiemx;
        // thông báo yêu cầu nhập vào hệ số A
        System.out.println("nhap he so A ");
        // Doc gia tri nguoi dung nhap vao tu ban phim => gan vao bien
        // khai bao doi tuong Scanner de doc du lieu tu nguoi dung nhap vao
        Scanner sr = new Scanner(System.in);
        // gan gia tri nguoi dung nhap vao tu ban phin cho bien so heSoA
        hesoA = sr.nextDouble();
        // thông báo yêu cầu nhập vào hệ số B
        System.out.println("nhap he so B ");
        // gan gia tri nguoi dung nhap vao tu ban phin cho bien so heSoB
        hesoB = sr.nextDouble();
        // thông báo yêu cầu nhập vào hệ số B
        System.out.println("nhap he so C ");
        // gan gia tri nguoi dung nhap vao tu ban phin cho bien so heSoB
        hesoC = sr.nextDouble();
        Delta = hesoB * hesoB - 4 * hesoA * hesoC;
        if (hesoA <= 0) {
            System.out.println("phương trình trở lại phương trình bậc nhất 1 ẩn ");
            nghiemx = -hesoB / hesoA;
            System.out.println("nghiemx " + nghiemx);
        } else if (Delta > 0) {
            System.out.println("phương trình có 2 nghiệm phân biệt  ");
            System.out.println("nghiemx1 " + (-hesoB + Math.sqrt(Delta) / 2 * hesoA));
            System.out.println("nghiemx2 " + (-hesoB - Math.sqrt(Delta) / 2 * hesoA));
        } else if (Delta == 0) {
            System.out.println("phương trình có nghiệm kép  ");
            System.out.println("nghiemx " + (nghiemx = -hesoB / 2 * hesoA));
        } else {
            System.out.println("phương trình vô nghiệm  ");

        }
    }
}
