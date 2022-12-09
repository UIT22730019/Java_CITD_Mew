package geometry;

/**
 * Menu.
 *
 * @author hasu
 */
public class Menu {

    private final MenuItem[] optionList = {
        MenuItem.EXIT,
        MenuItem.POINT,
        MenuItem.LINE_SEGMENT,
        MenuItem.TRIANGLE,
        MenuItem.RECTANGLE
    };

    public Menu() {

    }

    public MenuItem getUserChoice() {
        String menuCaption = "Geometry";
        int numItems = showOptionMenu(menuCaption, optionList);
        int choice = Util.inputInteger("Please enter your choice", 0, numItems - 1);
        return optionList[choice];
    }

    private int showOptionMenu(String menuCaption, MenuItem[] optionList) {
        System.out.println("*********************************************");
        System.out.println(menuCaption);
        for (int i = 1; i < optionList.length; i++) {
            System.out.printf("(%d) -> %s\n", i, optionList[i].getLabel());
        }
        System.out.printf("(0) -> %s\n", optionList[0].getLabel());
        System.out.println("*********************************************");
        return optionList.length;
    }

}
