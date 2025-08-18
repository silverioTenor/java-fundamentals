package Lesson1;

import java.util.Scanner;

import static helper.AppHelper.console;

public class Rectangle {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        console("====================");
        console("Enter with the value of rectangle base");
        var base = scanner.nextInt();

        console("Enter with the value of rectangle height");
        var height = scanner.nextInt();

        calcArea(base, height);
    }

    private static void calcArea(int base, int height) {
        var area = base * height;
        console("Formula (area = base x height): " + area + " = " + base + " x " + height);
    }
}
