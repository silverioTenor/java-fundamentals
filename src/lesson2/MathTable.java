package lesson2;

import java.util.Scanner;

import static helper.AppHelper.console;

public class MathTable {
    public static void main(String[] args) {
        console("==========");
        console("Math table");
        console("==========");
        console(" ");

        var scan = new Scanner(System.in);
        var option = 0;

        do {
            console("Select one of options:");
            console("(1) Sum");
            console("(2) Subtraction");
            console("(3) Multiplication");
            console("(4) Division");
            console("(5) Exit");

            console(" ");

            option = scan.nextInt();

            if (option < 1 || option > 5) {
                console("Invalid option");
                continue;
            }

            if (option != 5) {
                console("Enter with number you want to calculate:");
                var number = scan.nextInt();

                switch (option) {
                    case 1, 2, 3, 4 -> generateTable(option, number);
                }
            }
        } while (option != 5);
    }

    private static void generateTable(int option, int number) {
        console(" ");
        console("=============");
        console("=============");

        for (int i = 1; i <= 10; i++) {
            switch (option) {
                case 1 -> {
                    console(number + " + " + i + " = " + (number + i));
                }
                case 2 -> {
                    console(number + " - " + i + " = " + (number - i));
                }
                case 3 -> {
                    console(number + " x " + i + " = " + (number * i));
                }
                case 4 -> {
                    console(number + " / " + i + " = " + (number / i));
                }
                default -> {
                    console("Invalid option!");
                    break;
                }
            }
        }

        console("=============");
        console("=============");
        console(" ");
    }
}
