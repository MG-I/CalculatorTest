package calculator;

public class Calculation {
    public static double divide(double valueOne, double valueTwo, char operation) {
        double result ;
        result = valueOne / valueTwo;
        return result;
    }

    public static double fold(double valueOne, double valueTwo, char operation) {
        double result;
        result = valueOne + valueTwo;
        return result;
    }

    public static double subtract(double valueOne, double valueTwo, char operation) {
        double result ;
        result = valueOne - valueTwo;
        return result;
    }

    public static double multiplication(double valueOne, double valueTwo, char operation) {
        double result;
        result = valueOne * valueTwo;
        return result;
    }
}
