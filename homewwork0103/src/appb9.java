import java.util.Scanner;

public class appb9 {
    public static void main(String[] args) throws Exception {
        String chuoi;
        int sokytuhoa = 0, sokytuthuong = 0, soconso = 0;
        Scanner scanner = new Scanner(System.in);
        // nhập chuỗi
        System.out.println("nhập vào 1 chuỗi  : ");
        chuoi = scanner.nextLine();
        // đếm
        for (int i = 0; i < chuoi.length(); i++) {
            // đếm ký tự hoa
            if (Character.isUpperCase(chuoi.charAt(i))) {
                sokytuhoa++;
            } else if (Character.isLowerCase(chuoi.charAt(i))) {// đếm ký tự thường
                sokytuthuong++;
            } else if (Character.isDigit(chuoi.charAt(i))) {// đếm số
                soconso++;
            }
        }
        System.out.println("số ký tự hoa là : " + sokytuhoa);
        System.out.println("số ký tự thường là : " + sokytuthuong);
        System.out.println("số con số là : " + soconso);
    }
}
