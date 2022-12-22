package geometry;

/**
 * Menu item.
 *
 * @author hasu
 */
public enum MenuItem {
    EXIT("Exit"),
    POINT("Point"),
    LINE_SEGMENT("Line segment"),
    TRIANGLE("Triangle"),
    RECTANGLE("Rectangle");

    private final String label;

    public String getLabel() {
        return label;
    }

    private MenuItem(String label) {
        this.label = label;
    }

}
