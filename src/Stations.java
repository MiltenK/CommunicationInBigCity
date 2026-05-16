public class Stations {
    public String name;
    public int x, y, r;

    public Stations(String name, int x, int y, int r) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
