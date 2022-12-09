package geometry;

import java.util.Scanner;

/**
 * Util.
 *
 * @author hasu
 */
public final class Util {

    private Util() {
    }

    public static String inputString(String message, boolean allowBlankOrEmpty) {
        String inputString;
        Scanner sc = new Scanner(System.in);
        if (allowBlankOrEmpty) {
            message += ": ";
        } else {
            message += " (not blank or empty): ";
        }
        do {
            System.out.print(message);
            inputString = sc.nextLine();
        } while (!allowBlankOrEmpty && inputString.isBlank());
        return inputString;
    }

    public static int inputInteger(String message, int minValue, int maxValue) {
        int val = Integer.MIN_VALUE;
        message += " in the range [" + minValue + ", " + maxValue + "]: ";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            try {
                val = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        } while (val < minValue || maxValue < val);
        return val;
    }

    public static Double inputDouble(String message, Double minVal, Double maxVal, boolean allowBlankOrEmpty) {
        Double fValue = null;
        String sValue;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            sValue = sc.nextLine();
            if (allowBlankOrEmpty && sValue.isBlank()) {
                return null;
            }
            try {
                fValue = Double.valueOf(sValue.trim());
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
        } while ((minVal != null && fValue < minVal) || (maxVal != null && maxVal < fValue));
        return fValue;
    }
}
