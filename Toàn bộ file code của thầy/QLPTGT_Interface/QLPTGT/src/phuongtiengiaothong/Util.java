package phuongtiengiaothong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.format.DateTimeParseException;
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

    public static Integer inputInteger(String message, int minValue, int maxValue, boolean allowEmpty) {
        Integer inputInt = null;
        Scanner sc = new Scanner(System.in);
        String strNum = "";
        do {
            System.out.print(message + "(minValue = " + minValue + "maxValue = " + maxValue + ") : ");
            try {
                strNum = sc.nextLine();
                inputInt = Integer.parseInt(strNum);
            } catch (NumberFormatException ex) {
                if (strNum.isBlank()) {
                    return null;
                }
            }
        } while (!allowEmpty && inputInt < minValue || inputInt > maxValue);
        return inputInt;
    }

    public static Year inputYear(String message, Year minValue, Year maxValue, boolean allowEmpty) {
        Year inputYear = null;
        Scanner sc = new Scanner(System.in);
        String sYear;
        do {
            System.out.print(message + "(minValue = " + minValue + "maxValue = " + maxValue + ") : ");
            sYear = sc.nextLine().trim();
            if (allowEmpty && sYear.isBlank()) {
                return null;
            }
            try {
                inputYear = Year.parse(sYear);
            } catch (DateTimeParseException ex) {
                System.out.println(ex.getMessage());
            }
        } while (inputYear == null || inputYear.isBefore(minValue) || inputYear.isAfter(maxValue));
        return inputYear;
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
