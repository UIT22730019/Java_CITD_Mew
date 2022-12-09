package geometrymgr;

/**
 *
 * @author hasu
 */
public class LineSegment extends Geometry {

    public LineSegment() {
    }

    public LineSegment(Point p1, Point p2) throws GeometryException {
        addPoint(p1);
        addPoint(p2);
    }

    public double length() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("LineSegment is invalid!");
        }
        return Geometry.length(points.get(0), points.get(1));
    }

    @Override
    public double perimeterCalculate() throws GeometryException {
        return length();
    }

    @Override
    public double areaCalculate() throws GeometryException {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LineSegment:\t{ ");
        sb.append(super.toString());
        sb.append("\n\t\tlength: ");
        try {
            sb.append(String.format("%.2f", length()));
        } catch (GeometryException ex) {
            sb.append(ex.getMessage());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    protected int getNumberPoints() {
        return 2;
    }

}
