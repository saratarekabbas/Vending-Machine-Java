/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VMPackage;

/**
 *
 * @author Sara
 */
public class JavaChecker {

    public static void stringIsNull(String stringValue) { //if string value is null, make it = 0
        if (stringValue == null || stringValue.equals("")) {
            stringValue = "0";
        }
    }

    public static boolean isWhole(String stringValue) { //is a whole number
        stringIsNull(stringValue); //to make it = 0 if it is a null
        try {
            int intValue;
            intValue = Integer.parseInt(stringValue);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
    
    
    
//    if (drinkDDH == false){
//    Please insert a numeric value
//}

}
