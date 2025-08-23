package lesson3.schoolSystem;

import java.util.Scanner;

import static helper.AppHelper.console;

sealed class Employee extends Person implements Authenticable permits Teacher {
    public boolean isAuthenticated = false;

    @Override
    public void login() {
        var scan = new Scanner(System.in);

        do {
            console("Enter with your credential");
            var credential = scan.next();

            if (this.getID().equals(credential)) break;

            console("Invalid credential!");
        } while (true);

        var firstName = this.getName().split(" ")[0];
        console("Welcome " + firstName + "!");

        isAuthenticated = true;
    }

    @Override
    public void logout() {
        if (isAuthenticated) {
            isAuthenticated = false;

            console("Thanks for your work today!");
            console("Have a good rest.");
        }
    }


}
