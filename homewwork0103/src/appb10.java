import java.util.Scanner;

public class appb10 {
    public static void main(String[] args) throws Exception {
        String chuoi;
        char kytu;
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        // nhập chuỗi
        System.out.println("nhập vào 1 chuỗi  : ");
        chuoi = scanner.nextLine();
        // nhập ký tự cần ktra
        System.out.println("nhập vào 1 ký tự  : ");
        kytu = scanner.next().charAt(0);// gán ký tự vừa nhập vào biến ký tự
        // chạy qua lần lượt từng ký tự của chuối và so sánh nếu trùng với ký tự nhập
        // thì tăng biến đếm lên 1
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                dem++;
            }
        }
        System.out.println("số ký tự giống ký tự bạn vừa nhập là :" + dem);
    }
}
