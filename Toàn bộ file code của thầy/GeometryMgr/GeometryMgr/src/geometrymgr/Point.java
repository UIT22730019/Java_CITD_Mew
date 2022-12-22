package geometrymgr;

import java.util.Scanner;

/**
 *
 * @author hasu
 */
public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("(x, y): ");
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(')');
        return sb.toString();
    }

}
