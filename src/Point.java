import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Comparator;

public class Point {
    double x, y;

    public double distanceTo(Point other) {
        return sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}