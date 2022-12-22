package geometry;

/**
 * Triangle.
 *
 * @author hasu
 */
public class Triangle extends Geometry {

    private Point pointA;
    private Point pointB;
    private Point pointC;

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

    public Point getPointC() {
        return pointC;
    }

    public final void setPointC(Point pointC) throws GeometryException {
        if (pointC == null) {
            throw new GeometryException("Point C is null");
        }
        this.pointC = pointC;
    }

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) throws GeometryException {
        this.setPointA(a);
        this.setPointB(b);
        this.setPointC(c);
    }

    public Triangle(
            double xA, double yA,
            double xB, double yB,
            double xC, double yC) throws GeometryException {
        this.setPointA(new Point("A", xA, yA));
        this.setPointB(new Point("B", xB, yB));
        this.setPointC(new Point("C", xC, yC));
    }

    @Override
    public void input() throws GeometryException {
        System.out.println("Input triangle ...");
        Point pA = new Point();
        pA.input();
        Point pB = new Point();
        pB.input();
        Point pC = new Point();
        pC.input();
        this.setPointA(pA);
        this.setPointB(pB);
        this.setPointC(pC);
    }

    @Override
    public boolean isValid() {
        try {
            double ab = length(this.pointA, this.pointB);
            double bc = length(this.pointB, this.pointC);
            double ca = length(this.pointC, this.pointA);
            if (ab < bc + ca && bc < ca + ab && ca < bc + ca) {
                return true;
            }
        } catch (GeometryException ex) {
        }
        return false;
    }

    @Override
    public double perimeter() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Triangle is invalid");
        }
        return length(this.pointA, this.pointB)
                + length(this.pointB, this.pointC)
                + length(this.pointC, this.pointA);
    }

    @Override
    public double area() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Triangle is invalid");
        }
        double ab = length(this.pointA, this.pointB);
        double bc = length(this.pointB, this.pointC);
        double ca = length(this.pointC, this.pointA);
        double sp = (ab + bc + ca) / 2;
        return Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangle {\t");
        sb.append(pointA);
        sb.append("\n\t\t");
        sb.append(pointB);
        sb.append("\n\t\t");

        sb.append(pointC);
        if (isValid()) {
            try {
                sb.append("\n\t\tPerimeter: ");
                sb.append(String.format("%.1f", perimeter()));
                sb.append("\n\t\tArea: ");
                sb.append(String.format("%.1f", area()));
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
