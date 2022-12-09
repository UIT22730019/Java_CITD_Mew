package geometrymgr;

/**
 *
 * @author hasu
 */
public class Rectangle extends Geometry {

    public Rectangle() {
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) throws GeometryException {
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
        addPoint(p4);
    }

    @Override
    public boolean isValid() {
        if (super.isValid()) {
            double ab = Geometry.length(points.get(0), points.get(1));
            double bc = Geometry.length(points.get(1), points.get(2));
            double cd = Geometry.length(points.get(2), points.get(3));
            double da = Geometry.length(points.get(3), points.get(0));
            return ab == cd && bc == da
                    && Geometry.isRightAngle(points.get(0), points.get(1), points.get(2));
        }
        return false;
    }

    @Override
    public double perimeterCalculate() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Rectangle is invalid!");
        }
        double ab = Geometry.length(points.get(0), points.get(1));
        double bc = Geometry.length(points.get(1), points.get(2));
        return 2 * (ab + bc);
    }

    @Override
    public double areaCalculate() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Rectangle is invalid!");
        }
        double ab = Geometry.length(points.get(0), points.get(1));
        double bc = Geometry.length(points.get(1), points.get(2));
        return ab * bc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle:\t{ ");
        sb.append(super.toString());
        sb.append("\n\t\tperimeter: ");
        try {
            sb.append(String.format("%.2f", perimeterCalculate()));
        } catch (GeometryException ex) {
            sb.append(ex.getMessage());
        }
        sb.append("\n\t\tarea: ");
        try {
            sb.append(String.format("%.2f", areaCalculate()));
        } catch (GeometryException ex) {
            sb.append(ex.getMessage());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    protected int getNumberPoints() {
        return 4;
    }

}
