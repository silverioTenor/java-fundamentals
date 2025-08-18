package lesson2;

import java.util.Scanner;

import static helper.AppHelper.console;

public class ChooseOddOrEven {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        console("==========================================");
        console("Show numbers odd or even between 2 numbers");
        console("==========================================");

        console(" ");
        var wantContinue = true;

        while (wantContinue) {
            console("Enter with first number");
            var numberOne = scan.nextInt();
            console("Enter with second number. This must be greater than the first");
            var numberTwo = scan.nextInt();

            console(" ");

            console("Select one option:");
            console("(1) Odd");
            console("(2) Even");
            var option = scan.nextInt();

            for (int i = numberTwo; i >= numberOne ; i--) {
                switch (option) {
                    case 1 -> {
                        if (i % 2 == 1) console("" + i);
                    }
                    case 2 -> {
                        if (i % 2 == 0) console("" + i);
                    }
                }
            }

            console(" ");

            console("Do you want continue? (y/N)");
            var response = scan.next();
            wantContinue = response.equals("y");

            console(" ");
        }
    }
}
