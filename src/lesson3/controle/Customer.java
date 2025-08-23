package lesson3.controle;

import helper.AppHelper;

public class Customer {
    private String id;
    private String name;
    private int age;
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  ID: " + id + "\n" +
                "  name: " + name + "\n" +
                "  age: " + age + "\n" +
                "  active: " + active + "\n" +
                "}";
    }
}
