/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VMPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Sara
 */
public class JavaChecker {

    public static boolean stringIsNull(String stringValue) { //if string value is null, make it = 0
        if (stringValue == null || stringValue.equals("")) {
            return true;
        }
        return false;
    }

    public static boolean isWhole(String stringValue) { //is a whole number
        try {
            Integer.valueOf(stringValue);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

    public static boolean isNumeric(String stringValue) { //is a number
        try {
            Double.parseDouble(stringValue);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Double.");
        }
        return false;
    }

    public static double roundUp(String stringValue) {
        BigDecimal bd = BigDecimal.valueOf(Double.parseDouble(stringValue));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
                System.out.println("Number " + stringValue + "is formatted.");
        return bd.doubleValue();
    }
}
