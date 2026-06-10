package Day01.javaBasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // program1 : Calculator :
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second number ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The Sum is "+sum);

        int sub = num1 - num2;
        System.out.println("The subtraction is "+sub);

        int multiplication = num1 * num2;
        System.out.println("The multiplication is "+multiplication);

        int division = num1/num2;
        System.out.println("The division is "+division);
    }
}
