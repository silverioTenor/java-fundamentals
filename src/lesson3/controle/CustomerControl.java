package lesson3.controle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import static helper.AppHelper.console;

public class CustomerControl {
    private final ArrayList<Customer> customers = new ArrayList<>();

    private final Scanner scan = new Scanner(System.in);

    public void register() {
        var customer = new Customer();
        customer.setId(UUID.randomUUID().toString());

        console("Enter with name");
        customer.setName(scan.next());

        console("Enter with age");
        customer.setAge(scan.nextInt());

        customer.activate();

        customers.add(customer);
    }

    public void show(String id) {
        customers.forEach(customer -> {
            if (customer.getId().equals(id)) console(customer.toString());
        });
    }

    public void update(String id) {
        console("Enter with age");

        customers.forEach(customer -> {
            if (customer.getId().equals(id)) customer.setAge(scan.nextInt());
        });
    }

    public void deactivate(String id) {
        customers.forEach(customer -> {
            if (customer.getId().equals(id)) customer.deactivate();
        });
    }

    public void list() {
        customers.forEach(customer -> console("-> " + customer));
    }

    public void list(boolean active) {
        customers.forEach(customer -> {
            if (customer.isActive()) console("-> " + customer);
        });
    }
}
