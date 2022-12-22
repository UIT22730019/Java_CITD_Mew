package geometry;

/**
 * Point.
 *
 * @author hasu
 */
public class Point {

    private String name;
    private double x;
    private double y;

    public String getName() {
        return name;
    }

    public final void setName(String name) throws GeometryException {
        if (name == null || name.isBlank()) {
            throw new GeometryException("Point's name is null or empty");
        }
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public final void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public final void setY(double y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(String name, double x, double y) throws GeometryException {
        this.setName(name);
        this.setX(x);
        this.setY(y);
    }

    public void input() throws GeometryException {
        setName(Util.inputString("Input point's name", false));
        setX(Util.inputDouble("Input x", null, null, false));
        setY(Util.inputDouble("Input y", null, null, false));
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (");
        sb.append(String.format("%.1f", x));
        sb.append(", ");
        sb.append(String.format("%.1f", y));
        sb.append(')');
        return sb.toString();
    }
}
