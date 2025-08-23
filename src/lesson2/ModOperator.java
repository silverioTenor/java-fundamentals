package lesson2;

import helper.AppHelper;

import java.util.Scanner;

public class ModOperator {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        AppHelper.console("Enter with the first number");
        var firstNumber = scan.nextInt();
        var continueLoop = true;

        do {
            AppHelper.console("Enter with other number");
            var otherNumber = scan.nextInt();

            if (otherNumber > firstNumber) {
                if (otherNumber % firstNumber == 0) continueLoop = false;
            }
        } while (continueLoop);
    }
}
