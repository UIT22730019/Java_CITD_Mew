package geometrymgr;

import java.util.Scanner;

/**
 *
 * @author hasu
 */
public class Menu {

    private MenuItem itemList[] = {
        MenuItem.Exit,
        MenuItem.LineSegment,
        MenuItem.Triangle,
        MenuItem.Rectangle,};

    public MenuItem getUserChoice() {
        int items = showMenu();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter choice in range [0, " + (items - 1) + "]: ");
            choice = sc.nextInt();
        } while (choice < 0 || choice >= items);
        return this.itemList[choice];
    }

    private int showMenu() {
        System.out.println("***********************");
        for (int i = 1; i < this.itemList.length; i++) {
            System.out.println(i + ": " + this.itemList[i].name());
        }
        System.out.println(0 + ": " + itemList[0].name());
        return this.itemList.length;
    }
}
