public class Station {
    public String name;
    public int r;
    public Point point;

    public Station(String name, int x, int y, int r) {
        this.name = name;
        point = new Point(x, y);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "name='" + name + '\'' +
                ", x=" + point.x +
                ", y=" + point.y +
                ", r=" + r +
                '}';
    }
}
