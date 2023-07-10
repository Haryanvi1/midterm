package arithmetic;

import java.util.Scanner;

enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

public class ArithmeticBase {
    public double x, y;
    
    double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to perform: ");
        Operation operation = Operation.valueOf(sc.next().toUpperCase());
        
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}
