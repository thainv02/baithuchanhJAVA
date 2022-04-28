import khachhang.*;
import dongvat.*;
import nhanvien.*;

public class App {
    public static void main(String[] args) throws Exception {
        customer customer = new customer();
        customer.nhap1();
        fullTimeEmpoyee ft = new fullTimeEmpoyee();
        ft.nhap();
    }
}
