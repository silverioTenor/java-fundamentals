import java.util.Scanner;

import static helper.AppHelper.console;

public class DiffPersonAge {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        console("====================");

        var personOne = new Person();
        console("Enter with name of the first person:");
        personOne.name = scanner.next();
        console("Enter with age of the first person:");
        personOne.age = scanner.nextInt();

        console("====================");

        var personTwo = new Person();
        console("Enter with name of the second person:");
        personTwo.name = scanner.next();
        console("Enter with age of the second person:");
        personTwo.age = scanner.nextInt();

        var diff = personOne.age - personTwo.age;
        var diffReplaced = diff > -1 ? diff : diff * (-1);

        console(" ");
        System.out.printf("The diff of age between %s and %s is %s", personOne.name, personTwo.name, diffReplaced);
    }
}
