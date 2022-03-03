import java.util.Scanner;

public class appb3 {
    public static void main(String[] args) throws Exception {
        String name;
        int year, age;
        Scanner scanner = new Scanner(System.in);
        // nhập chuỗi
        System.out.println("nhập vào tên bạn  : ");
        name = scanner.nextLine();
        do {
            System.out.println("nhập vào năm sinh : ");
            year = scanner.nextInt();
        } while (year >= 2022);
        age = 2022 - year;
        if (age < 16) {
            System.out.println("bạn " + name + " ở độ tuổi vị thành niên");
        } else if (age >= 16 && age < 18) {
            System.out.println("bạn " + name + " ở độ tuổi trưởng thành");
        } else {
            System.out.println("bạn " + name + " da già :)");
        }
    }
}
