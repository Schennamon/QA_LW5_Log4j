import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Input number A");
        int A = scanner.nextInt();
        System.out.println("Input number B");
        int B = scanner.nextInt();
        System.out.println("Choose operation +, -, *, /");
        String operation;
        operation = scanner.next();
        switch (operation) {
            case "+" -> System.out.println(calculator.sum(A, B));
            case "-" -> System.out.println(calculator.subtraction(A, B));
            case "*" -> System.out.println(calculator.multiplication(A, B));
            case "/" -> System.out.println(calculator.division(A, B));
        }
    }

    public int sum(int A, int B){
        return A+B;
    }

    public double division(int A, int B){
        return A/B;
    }

    public int subtraction(int A, int B){
        return A-B;
    }

    public int multiplication(int A, int B){
        return A*B;
    }

}
