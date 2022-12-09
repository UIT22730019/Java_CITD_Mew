package geometry;

/**
 * Shape.
 *
 * @author hasu
 */
public class Shape {

    private void processPoint() {
        Point p = new Point();
        try {
            p.input();
        } catch (GeometryException ex) {
            System.out.println(ex.getMessage());
        }
        if (p != null) {
            p.output();
        }
    }

    private void processLineSegment() {
        LineSegment line = new LineSegment();
        try {
            line.input();
        } catch (GeometryException ex) {
            System.out.println(ex.getMessage());
        }
        if (line != null) {
            line.output();
        }
    }

    private void processTriangle() {
        Triangle triangle = new Triangle();
        try {
            triangle.input();
        } catch (GeometryException ex) {
            System.out.println(ex.getMessage());
        }
        if (triangle != null) {
            triangle.output();
        }
    }

    private void processRectangle() {
        Rectangle rectangle = new Rectangle();
        try {
            rectangle.input();
        } catch (GeometryException ex) {
            System.out.println(ex.getMessage());
        }
        if (rectangle != null) {
            rectangle.output();
        }
    }

    private void process() {
        Menu menu = new Menu();
        MenuItem userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case EXIT ->
                    System.out.println("Exited!");
                case POINT ->
                    processPoint();
                case LINE_SEGMENT ->
                    processLineSegment();
                case TRIANGLE ->
                    processTriangle();
                case RECTANGLE ->
                    processRectangle();
                default ->
                    System.out.println("???");
            }
        } while (userChoice != MenuItem.EXIT);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Shape().process();
    }

}
