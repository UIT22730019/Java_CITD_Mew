package qlsanpham;

import java.util.Scanner;

/**
 *
 * @author hasu
 */
public final class Util {

    private Util() {
    }

    public static String inputString(String message) {
        String inputVal = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            inputVal = sc.nextLine();
        } while (inputVal.isBlank());
        return inputVal;
    }

    public static float inputFloat(String message, float minVal, float maxVal) {
        float inputVal = 0.0F;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message + ": ");
            inputVal = sc.nextFloat();
        } while (inputVal < minVal || maxVal < inputVal);
        return inputVal;
    }
}
