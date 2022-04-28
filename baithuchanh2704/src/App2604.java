import Shape.Point;
import Shape.Quadrilateral;

public class App2604 {
    public static void main(String[] args) throws Exception {
        Point point = new Point();
        point.gettendiem();
        point.gethoanhdo();
        point.gettungdo();
        point.settendiem();
        point.sethoanhdo();
        point.settungdo();
        point.nhap();
        point.in();
        Quadrilateral tugiac = new Quadrilateral();
        tugiac.nhapDiem();
        tugiac.kiemTraTuGiac();
    }
}
