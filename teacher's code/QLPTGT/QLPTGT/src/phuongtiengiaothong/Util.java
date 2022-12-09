package phuongtiengiaothong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hasu
 */
public final class Util {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private Util() {
    }

    public static String inputString(String message, boolean allowEmpty) {
        String inputStr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            inputStr = sc.nextLine();
        } while (!allowEmpty && inputStr.isBlank());
        return inputStr;
    }

    public static int inputInteger(String message, int minValue, int maxValue) {
        int inputInt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + "(minValue = " + minValue + ") : ");
            inputInt = sc.nextInt();
        } while (inputInt < minValue || inputInt > maxValue);
        return inputInt;
    }

    public static float inputFloat(String message, float minValue) {
        float inputFloat;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + "(minValue = " + minValue + ") : ");
            inputFloat = sc.nextFloat();
        } while (inputFloat < minValue);
        return inputFloat;
    }

    public static double inputDouble(String message, double minValue) {
        double inputDouble;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + "(minValue = " + minValue + ") : ");
            inputDouble = sc.nextDouble();
        } while (inputDouble < minValue);
        return inputDouble;
    }

    public static Date inputDate(String message) {
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_FORMAT);
        df.setLenient(false);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + " (" + Util.DATE_FORMAT + "): ");
            try {
                return df.parse(sc.nextLine());
            } catch (ParseException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    public static String toString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_FORMAT);
        return df.format(date);
    }
}
