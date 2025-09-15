package lesson4.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("============== OPTION 1 ==============");
        System.out.println(" ");

        String[] names = { "João", "Maria", "Joaquim" };

        for (String name : names) {
            System.out.println("=> " + name);
        }

        System.out.println(" ");
        System.out.println("============== OPTION 2 ==============");
        System.out.println(" ");

        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Initial status (product[" + i + "]) => " + products[i]);
        }

        System.out.println(" ");

        int count = 0;

        while (count < products.length) {
            Product p = new Product();
            int id = 1 + count;

            p.setId(id);
            p.setName("P"+id);
            p.setPrice(id+0.45);

            products[count] = p;

            count++;
        }

        for (int i = 0; i < products.length; i++) {
            System.out.println("Final status (product[" + i + "]) => " + products[i]);
        }

        System.out.println(" ");
        System.out.println("============== OPTION 3 ==============");
        System.out.println(" ");

        List<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.add(1, "Bird");

        animals.forEach(System.out::println);
    }
}
