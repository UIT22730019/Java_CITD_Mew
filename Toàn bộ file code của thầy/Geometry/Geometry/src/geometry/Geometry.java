package geometry;

/**
 * Abstract class Geometry.
 *
 * @author hasu
 */
public abstract class Geometry {

    public static double length(Point a, Point b) throws GeometryException {
        if (a == null || b == null) {
            throw new GeometryException("Point A or B is null");
        }
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    public static boolean isRightAngle(Point a, Point b, Point c) throws GeometryException {
        if (a == null || b == null || c == null) {
            throw new GeometryException("Point A or B or C is null");
        }
        double xU = a.getX() - b.getX();
        double yU = a.getY() - b.getY();
        double xV = c.getX() - b.getX();
        double yV = c.getY() - b.getY();
        return (xU * xV - yU * yV) == 0;
    }

    public void output() {
        System.out.println(toString());
    }

    public abstract void input() throws GeometryException;

    public abstract boolean isValid();

    public abstract double perimeter() throws GeometryException;

    public abstract double area() throws GeometryException;
}
