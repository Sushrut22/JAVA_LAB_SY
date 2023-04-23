import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                System.out.println("The quotient is: " + result);
                break;
            default:
                System.out.println("Error: invalid operator");
        }

        sc.close();
    }
}
