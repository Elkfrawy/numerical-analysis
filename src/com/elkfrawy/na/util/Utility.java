package com.elkfrawy.na.util;

/**
 * Created by Ayman on 3/29/2015.
 */
public class Utility {

    public static void main(String[] args) {

    }

    public static double eval(String function) {
        if (function.contains("+")) {
            String[] parts = function.split("\\+");
            double result = 0;
            for (String part : parts) {
                result += eval(part);
            }
            return result;
        } else if (function.contains("-")) {
            String[] parts = function.split("-");
            double result = eval(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                result -= eval(parts[i]);
            }
            return result;
        } else if (function.contains("*")) {
            String[] parts = function.split("\\*");
            double result = 1;
            for (String part : parts) {
                result *= eval(part);
            }
            return result;
        } else if (function.contains("/")) {
            String[] parts = function.split("/");
            double result = eval(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                result /= eval(parts[i]);
            }
            return result;
        } else if (function.equals("")) return 0;
        else return Double.parseDouble(function);
    }

}
