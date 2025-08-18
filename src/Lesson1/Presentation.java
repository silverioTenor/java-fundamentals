package Lesson1;

import java.util.Scanner;

public class Presentation {
    public static final String WELCOME = "Hello dear!";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(WELCOME);
        System.out.println(" ");

        System.out.println("What's your name?");
        var name = scanner.next();

        System.out.println("What's your age?");
        var age = scanner.nextInt();

        System.out.printf("My name is %s and I have %s years old.", name, age);
    }
}
