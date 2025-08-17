import java.util.Scanner;

import static helper.AppHelper.console;

public class Square {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        console("====================");
        console("Enter with the value of square side");
        var squareSide = scanner.nextInt();

        calcArea(squareSide);
    }

    private static void calcArea(int side) {
        var area = side * side;
        console("Formula (area = side x side): " + area + " = " + side + " x " + side);
    }
}
