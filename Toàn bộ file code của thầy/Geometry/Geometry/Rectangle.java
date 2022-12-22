package geometry;

/**
 * Rectangle.
 *
 * @author hasu
 */
public class Rectangle extends Geometry {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

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

    public Point getPointD() {
        return pointD;
    }

    public final void setPointD(Point pointD) throws GeometryException {
        if (pointD == null) {
            throw new GeometryException("Point D is null");
        }
        this.pointD = pointD;
    }

    public Rectangle() {
    }

    public Rectangle(Point a, Point b, Point c, Point d) throws GeometryException {
        this.setPointA(a);
        this.setPointB(b);
        this.setPointC(c);
        this.setPointD(d);
    }

    public Rectangle(
            double xA, double yA,
            double xB, double yB,
            double xC, double yC,
            double xD, double yD) throws GeometryException {
        this.setPointA(new Point("A", xA, yA));
        this.setPointB(new Point("B", xB, yB));
        this.setPointC(new Point("C", xC, yC));
        this.setPointD(new Point("D", xD, yD));
    }

    @Override
    public void input() throws GeometryException {
        System.out.println("Input rectangle ...");
        Point pA = new Point();
        pA.input();
        Point pB = new Point();
        pB.input();
        Point pC = new Point();
        pC.input();
        Point pD = new Point();
        pD.input();
        this.setPointA(pA);
        this.setPointB(pB);
        this.setPointC(pC);
        this.setPointD(pD);
    }

    @Override
    public boolean isValid() {
        try {
            double ab = length(this.pointA, this.pointB);
            double bc = length(this.pointB, this.pointC);
            double cd = length(this.pointC, this.pointD);
            double da = length(this.pointD, this.pointA);
            if (ab != cd || bc != da || !isRightangle(this.pointA, this.pointB, this.pointC)) {
                return false;
            }
        } catch (GeometryException ex) {
            return false;
        }
        return true;
    }

    @Override
    public double perimeter() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Rectangle is invalid");
        }
        return 2 * (length(this.pointA, this.pointB)
                + length(this.pointB, this.pointC));
    }

    @Override
    public double area() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Rectangle is invalid");
        }
        double ab = length(this.pointA, this.pointB);
        double bc = length(this.pointB, this.pointC);
        return ab * bc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle {\t");
        sb.append(pointA);
        sb.append("\n\t\t");
        sb.append(pointB);
        sb.append("\n\t\t");
        sb.append(pointC);
        sb.append("\n\t\t");
        sb.append(pointD);
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
