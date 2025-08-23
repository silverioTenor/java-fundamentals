package lesson3.controle;

import java.util.Scanner;

import static helper.AppHelper.console;

public class Panel {
    public static void main(String[] args) {
        console("Customer registration panel");
        var scan = new Scanner(System.in);
        var customerControl = new CustomerControl();
        var stateLoop = true;

        do {
            console("Select an option");
            console(" ");

            console("=============================");
            console("[1] Register customer");
            console("[2] Show customer");
            console("[3] Update a customer");
            console("[4] Deactivate a customer");
            console("[5] List active customers");
            console("[6] List all customer");
            console("[7] Exit");
            console("=============================");
            console(" ");

            var option = scan.nextInt();
            var customerID = "";

            switch (option) {
                case 1 -> customerControl.register();
                case 2 -> {
                    console("Enter with customer ID");
                    customerID = scan.next();
                    customerControl.show(customerID);
                    break;
                }
                case 3 -> {
                    console("Enter with customer ID");
                    customerID = scan.next();
                    customerControl.update(customerID);
                    break;
                }
                case 4 -> {
                    console("Enter with customer ID");
                    customerID = scan.next();
                    customerControl.deactivate(customerID);
                    break;
                }
                case 5 -> customerControl.list(true);
                case 6 -> customerControl.list();
                case 7 -> stateLoop = false;
                default -> console("Invalid option!");
            }
        } while (stateLoop);
    }
}
