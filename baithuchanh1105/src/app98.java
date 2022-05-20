import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class app98 {
    public static void main(String[] args) {
        // khai báo1TreeMap tên treeMap1
        // mỗi phần tử trong treeMap1 bao gồm2phần
        // key (String) và value (Double)
        TreeMap<String, Double> treeMap1 = new TreeMap<>();
        // khai báo1TreeMap được tạo thành từ1Map
        Map<Float, Integer> map = new HashMap<>();
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
    }
}
