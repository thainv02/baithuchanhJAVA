package staticVD;

public class khaibao {
    // Cấu hình số lượng hình học
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;
    // Các cấu hình khác
    public static final float PI = 3.14f;
    static final float INCH_CM = 2.54f; // 1 inch = 2.54
    public static final int DON_VI_CM = 1; // Đánh dấu ứng dụng
    public static final int DON_VI_INC = 2; // Đánh dấu ứng dụng
    public static int donVi = DON_VI_CM; // Cờ Cho biết đang dùn
    // Phương thức static giúp chuyển đổi centimet sang inch

    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    // Phương thức static giúp chuyển đổi inch sang centimet
    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}
