package geometry;

/**
 * LineSegment.
 *
 * @author hasu
 */
public class LineSegment extends Geometry {

    private Point pointA;
    private Point pointB;

    public Point getPointA() {
        return pointA;
    }

    public final void setPointA(Point pointA) throws GeometryException {
        if (pointA == null) {
            throw new GeometryException("Point A is null");
        }
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public final void setPointB(Point pointB) throws GeometryException {
        if (pointB == null) {
            throw new GeometryException("Point B is null");
        }
        this.pointB = pointB;
    }

    public LineSegment() {
    }

    public LineSegment(Point a, Point b) throws GeometryException {
        this.setPointA(a);
        this.setPointB(b);
    }

    public LineSegment(double xA, double yA, double xB, double yB) throws GeometryException {
        this.setPointA(new Point("A", xA, yA));
        this.setPointB(new Point("B", xB, yB));
    }

    public double length() throws GeometryException {
        return Geometry.length(this.pointA, this.pointB);
    }

    @Override
    public void input() throws GeometryException {
        System.out.println("Input lineSegment ...");
        Point pA = new Point();
        pA.input();
        Point pB = new Point();
        pB.input();
        this.setPointA(pA);
        this.setPointB(pB);

    }

    @Override
    public boolean isValid() {
        return this.pointA != null && this.pointB != null;
    }

    @Override
    public double perimeter() throws GeometryException {
        return length();
    }

    @Override
    public double area() throws GeometryException {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LineSegment {\t");
        sb.append(pointA);
        sb.append("\n\t\t");
        sb.append(pointB);
        if (isValid()) {
            try {
                sb.append("\n\t\tLength: ");
                sb.append(String.format("%.1f", length()));
            } catch (GeometryException ex) {
                sb.append("\n\t\tError: ");
                sb.append(ex.getMessage());
            }
        } else {
            sb.append("\n\t\tError: invalid");
        }
        sb.append("\t}");
        return sb.toString();
    }
}
