package quanlynhanvien;

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

    public static String inputString(String message) {
        String inputStr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            inputStr = sc.nextLine();
        } while (inputStr.isBlank());
        return inputStr;
    }

    public static float inputFloat(String message, float minValue) {
        float inputFloat;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            inputFloat = sc.nextFloat();
        } while (inputFloat < minValue);
        return inputFloat;
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
