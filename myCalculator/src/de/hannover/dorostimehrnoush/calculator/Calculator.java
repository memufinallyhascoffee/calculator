package de.hannover.dorostimehrnoush.calculator;

import de.hannover.dorostimehrnoush.util.exception.DivisionByZeroException;

public class Calculator {
    public static float addition(float operator1, float operator2) {
        float value;
        value = operator1 + operator2;
        return  value;
    }

    public static float subtraction(float operator1, float operator2) {
        float value;
        value = operator1 - operator2;
        return  value;
    }

    public static float multiplication(float operator1, float operator2) {
        float value;
        value = operator1 * operator2;
        return  value;
    }

    public static float division(float operator1, float operator2) throws DivisionByZeroException {
        float value;
        if(operator1 < 1) throw new DivisionByZeroException("Hier wurde versucht durch 0 zu teilen");

        value = operator1 / operator2;
        return  value;
    }

    public static float pow(float operator1, float operator2) {
        float value;
        value = (float)Math.pow(operator1, operator2);
        return  value;
    }

    public static float root(float operator1, float operator2) {
        float value;
        value = root(operator1, operator2);
        return  value;
    }

    public static float absolut(float operator1, float operator2) {
        float value;
        value = Math.abs(operator1 + operator2);
        return  value;
    }

}
