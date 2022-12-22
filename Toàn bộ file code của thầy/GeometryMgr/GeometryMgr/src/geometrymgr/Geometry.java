package geometrymgr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hasu
 */
public abstract class Geometry {

    protected List<Point> points;

    public static double length(Point p1, Point p2) {
        double x = p2.getX() - p1.getX();
        double y = p2.getY() - p1.getY();
        return Math.sqrt(x * x + y * y);
    }

    public static boolean isRightAngle(Point p1, Point p2, Point p3) {
        double xU = p1.getX() - p2.getX();
        double yU = p1.getY() - p2.getY();
        double xV = p3.getX() - p2.getX();
        double yV = p3.getY() - p2.getY();
        return xU * xV + yU * yV == 0;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) throws GeometryException {
        if (points == null
                || points.size() != getNumberPoints()
                || !isValid()) {
            throw new GeometryException(getClass().getSimpleName() + " is invalid!");
        }
        this.points = points;
    }

    public Geometry() {
        this.points = new ArrayList();
    }

    public void input() {
        System.out.println("Input " + getClass().getSimpleName() + ":");
        Point p;
        for (int i = 0; i < getNumberPoints(); i++) {
            System.out.print("Input point " + i + " ");
            p = new Point();
            p.input();
            this.points.add(p);
        }
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point p : points) {
            sb.append(p);
            sb.append(", ");
        }
        return sb.toString();
    }

    public boolean isValid() {
        if (points.size() != getNumberPoints()) {
            return false;
        }
        for (Point p : points) {
            if (p == null) {
                return false;
            }
        }
        return true;
    }

    protected void addPoint(Point p) throws GeometryException {
        if (p == null) {
            throw new GeometryException("Point is null");
        }
        this.points.add(p);
    }

    public abstract double perimeterCalculate() throws GeometryException;

    public abstract double areaCalculate() throws GeometryException;

    protected abstract int getNumberPoints();
}
