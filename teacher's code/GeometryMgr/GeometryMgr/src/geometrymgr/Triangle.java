package geometrymgr;

/**
 *
 * @author hasu
 */
public class Triangle extends Geometry {

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) throws GeometryException {
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
    }

    @Override
    public boolean isValid() {
        if (super.isValid()) {
            double ab = Geometry.length(points.get(0), points.get(1));
            double bc = Geometry.length(points.get(1), points.get(2));
            double ca = Geometry.length(points.get(2), points.get(0));
//            return (Double.compare(ab, bc + ca) < 0
//                    && Double.compare(bc, ca + ab) < 0
//                    && Double.compare(ca, ab + bc) < 0);

            double e = 0.000000001;
            return !((ab + bc) - ca < e
                    || (bc + ca) - ab < e
                    || (ca + ab) - bc < e);
        }
        return false;
    }

    @Override
    public double perimeterCalculate() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Triangle is invalid!");
        }
        double ab = Geometry.length(points.get(0), points.get(1));
        double bc = Geometry.length(points.get(1), points.get(2));
        double ca = Geometry.length(points.get(2), points.get(0));
        return ab + bc + ca;
    }

    @Override
    public double areaCalculate() throws GeometryException {
        if (!isValid()) {
            throw new GeometryException("Triangle is invalid!");
        }
        double ab = Geometry.length(points.get(0), points.get(1));
        double bc = Geometry.length(points.get(1), points.get(2));
        double ca = Geometry.length(points.get(2), points.get(0));
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangle:\t{ ");
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
        return 3;
    }

}
