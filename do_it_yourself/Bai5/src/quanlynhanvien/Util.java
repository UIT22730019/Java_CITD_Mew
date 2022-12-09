/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author 84793
 */
public class Util {
    private static final String DATE_FORMAT = "dd/MM/YYYY";
    private Util() {
    }
    
    
    
    public static String inputString(String message){
        String inputStr;
        Scanner sc  = new Scanner(System.in);
                do {
        System.out.println(message+ ": ");
        inputStr = sc.nextLine();
        } while (inputStr.isBlank());
            return inputStr;
    }
    
        public static Date inputDate(String message){
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_FORMAT);
        Scanner sc  = new Scanner(System.in);
                do {
        System.out.println(message+ ": "+ Util.DATE_FORMAT +"): ");
            try {
                Date parse = df.parse(sc.nextLine());
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(Util.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } while (true);
    }
    public static String toString (Date date){
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_FORMAT);
        df.setLenient(false);
        return df.format(date);
    }
        public static float inputFloat(String message, float minValue){
        Float inputFloat;
        Scanner sc  = new Scanner(System.in);
                do {
        System.out.println(message+ ": ");
        inputFloat = sc.nextFloat();
        } while (inputFloat < minValue);
            return inputFloat;
    }
    
}
