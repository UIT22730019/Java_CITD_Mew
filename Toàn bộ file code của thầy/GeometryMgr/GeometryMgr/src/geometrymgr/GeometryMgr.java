package geometrymgr;

/**
 *
 * @author hasu
 */
public class GeometryMgr {

    private void lineSegmentProcess() {
        LineSegment li = new LineSegment();
        li.input();
        li.output();
    }

    private void triangleProcess() {
        Triangle tri = new Triangle();
        tri.input();
        tri.output();
    }

    private void rectangleProcess() {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.output();
    }

    private void process() {
        Menu menu = new Menu();
        MenuItem userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case Exit:
                    System.out.println("Bye bye!");
                    break;
                case LineSegment:
                    lineSegmentProcess();
                    break;
                case Triangle:
                    triangleProcess();
                    break;
                case Rectangle:
                    rectangleProcess();
                    break;
//                default:
//                    System.out.println("???");
            }
        } while (userChoice != MenuItem.Exit);

        System.out.println("Existed!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GeometryMgr().process();
    }

}
