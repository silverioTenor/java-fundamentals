package lesson3.schoolSystem;

import java.util.UUID;

sealed class Person permits Student, Employee {
    private String ID;
    private String name;
    private String position;

    private Person(String id, String name, String position) {
        this.ID = id;
        this.name = name;
        this.position = position;
    }

    public Person() {
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    private static class Builder {
        private final String ID = UUID.randomUUID().toString();
        private String name;
        private String position;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Person build() {
            return new Person(ID, name, position);
        }
    }
}
