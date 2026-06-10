package java_day_01;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class baiscJavaDay01 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Variable
        int x = 123;
        double y = 3.14f;
        boolean z = false;
        char symbol = '@';
        String name = "S N Gowda";
        System.out.println("My number is " + x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("My name is " + name);

        // swap variables
        int a = 1;
        int b = 2;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // User import in java
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String names = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + names);
        System.out.println("You are " +age + " year old");
        System.out.println("Your favourite food is "+food);

        // expressions, operanda and operators in java
          int friends = 10;
        //double friends = 10;

        friends = friends + 1;
        friends = friends - 1;
        friends = friends * 2;
        friends = friends / 2;
        friends++;
        friends--;
        friends = friends / 3;

        System.out.println(friends);

    }
}
