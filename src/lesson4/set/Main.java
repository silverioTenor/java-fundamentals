package lesson4.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Rodrigo");
        names.add("Fernanda");
        names.add("Gabriel");
        names.add("Alex");
        names.add("Juliana");

        names.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("============== ORDINATED ==============");
        System.out.println(" ");

        names.stream().sorted().forEach(System.out::println);

        System.out.println(" ");
        System.out.println("============== OPTION 2 ==============");
        System.out.println(" ");

        Set<Vehicle> vehicles = new HashSet<>();

        Vehicle car = new Vehicle("Ford", "Ranger", "Silver", 2025);
        Vehicle car2 = new Vehicle("Ford", "Ranger", "Red", 2024);
        Vehicle car3 = new Vehicle("Ford", "K", "Green", 2024);
        Vehicle car4 = new Vehicle("Citroen", "C4", "Silver", 2025);

        vehicles.add(car);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);

        vehicles.stream().sorted().forEach(System.out::println);

//        Iterator<Vehicle> iterator = vehicles.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle);
//        }

        System.out.println(" ");
        System.out.println("============== FIND ==============");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter with model:");
        String model = scan.next();

        Optional<Vehicle> foundVehicle = vehicles.stream()
                .filter(v -> v.getModel().equals(model))
                .findFirst();

        if (foundVehicle.isEmpty()) {
            System.out.println("Vehicle not found!");
        } else {
            System.out.println("Vehicle found: " + foundVehicle);
        }

//        System.out.println(" ");
//        System.out.println("============== OPTION 2 ==============");
//        System.out.println(" ");
//
//        Set<Vehicle> vehicles1 = new LinkedHashSet<>();
    }
}
