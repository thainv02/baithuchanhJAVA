import java.util.Scanner;

public class app35 {
    public static void main(String[] args) throws Exception {
        int numberOne, numberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap numberOne ");
        numberOne = scanner.nextInt();
        System.out.println("nhap numberOne ");
        numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.println("số lớn hơn là " + numberOne);
        }
        if (numberOne < numberTwo) {
            System.out.println("số lớn hơn là " + numberTwo);
        } else {
            System.out.println("hai số bằng nhau ");
        }

    }
}
