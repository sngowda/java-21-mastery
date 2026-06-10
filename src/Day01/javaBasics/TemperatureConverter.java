package Day01.javaBasics;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // program2: Temprature converter F=C×9/5+32
        Scanner scanner = new Scanner(System.in);

        System.out.println("The temperature in Celsius is ");
        float temperature = scanner.nextInt();

        float Fahrenheit = (temperature * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit is "+Fahrenheit);
    }
}
