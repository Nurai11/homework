package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter operation: ");
        char operation = scanner.next().charAt(0);


        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    if (num1 == 0 || num2 == 0) {
                        throw new DivideByZeroException("Вы не можете делить число на 0.");
                    } else {
                        System.out.println(num1 / num2);
                    }
                } catch (DivideByZeroException e) {
                    System.out.println(e.getMessage());
                }
        }
        System.out.println(result);
    }
}
