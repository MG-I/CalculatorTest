package calculator;

import java.util.Scanner;

public class CalculatorInputUtils {
    static Scanner SCANNER = new Scanner(System.in);

    public static double getDouble() {
        System.out.println("Enter number: ");
        double num;
        if (SCANNER.hasNextDouble()) {
            num = SCANNER.nextDouble();
        } else {
            System.out.println("Wrong number, try again.");
            SCANNER.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Choose operation + - * / ");
        char operation = 0;
        if (SCANNER.hasNext()) {
            operation = SCANNER.next().charAt(0);
        }
        return operation;
    }
}
