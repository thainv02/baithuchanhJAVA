import java.util.Scanner;

public class app90 {
    public static void main(String[] args) throws Exception {
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        // nhập chuỗi
        System.out.println("nhập vào 1 chuỗi  : ");
        chuoi = scanner.nextLine();
        // gán từng ký tự của chuỗi vào biến ký tự sau đó in biến ký tự ra trên từng
        // dòng
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
    }
}
