package lesson4.set;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {

    private String brand;

    private String model;

    private String color;

    private Integer year;

    public Vehicle(String brand, String model, String color, Integer year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle - { " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(brand, vehicle.brand) &&
               Objects.equals(model, vehicle.model) &&
               Objects.equals(color, vehicle.color) &&
               Objects.equals(year, vehicle.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public int compareTo(Vehicle otherVehicle) {
        // 1. Compara pela marca (brand)
        int comparison = Objects.compare(this.brand, otherVehicle.brand, String::compareTo);
        if (comparison != 0) {
            return comparison;
        }

        // 2. Se as marcas são iguais, compara pelo modelo
        comparison = Objects.compare(this.model, otherVehicle.model, String::compareTo);
        if (comparison != 0) {
            return comparison;
        }

        // 3. Se os modelos são iguais, compara pela cor
        comparison = Objects.compare(this.color, otherVehicle.color, String::compareTo);
        if (comparison != 0) {
            return comparison;
        }

        // 4. Se tudo o mais é igual, compara pelo ano
        return Objects.compare(this.year, otherVehicle.year, Integer::compareTo);
    }
}
