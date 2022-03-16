
import java.util.Scanner;

public class person {
    String PersonID;
    String PersonName;
    boolean Gender;
    String Address;

    void nhap() {
        System.out.println("nhập vào PersonID ");
        Scanner scanner = new Scanner(System.in);
        PersonID = scanner.nextLine();
        System.out.println("nhập vào PersonName ");
        PersonName = scanner.nextLine();
        System.out.println("nhập vào Gender ");
        Gender = scanner.nextBoolean();
        System.out.println("nhập vào Address ");
        Address = scanner.nextLine();
    }

    void Inthongtin() {
        System.out.println("PersonID = " + PersonID);
        System.out.println("PersonName = " + PersonName);
        System.out.println("Gender = " + Gender);
        System.out.println("Address = " + Address);
    }
}
