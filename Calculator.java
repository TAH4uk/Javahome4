import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double result;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.printf("Введите оператор правильно!");
                return;
        }
        System.out.print("\nПолученный результат:\n");
        System.out.printf(number1 + " " + operator + " " + number2 + " = " + result);
    }
}