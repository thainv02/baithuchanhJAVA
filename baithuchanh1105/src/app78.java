import java.util.HashMap;
import java.util.TreeMap;

public class app78 {
    public static void main(String[] args) {
        // khai báo1HashMap tên hashMap1
        // mỗi phần tử trong hashMap1 bao gồm2phần
        // key (Integer) và value (Float)
        HashMap<Integer, Float> hashMap1 = new HashMap<>();
        // khai báo1HashMap tên hashMap2
        // mỗi phần tử trong hashMap2 bao gồm2phần
        // key (String) và value (String)
        // có kích thước khởi tạo=10
        HashMap<String, String> hashMap2 = new HashMap<>(10);
        // khai báo1HashMap có kích thước khởi tạo
        // và yếu tố tải=0.75f (mặc định)
        // chi tiết về kích thước khởi tạo và yếu tố tải
        // các bạn xem lại bài HashSet
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);

        // khai báo1HashMap được tạo thành từ1Collection khác
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
    }
}
