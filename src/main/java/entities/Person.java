package entities;

import exceptions.PersonException;

public class Person {

    private String name;
    private int age;

    public Person() {
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

    // TODO -- Separate business logic from entity
    public void setAge(int age) throws PersonException {
        if (age >= 20 && age <= 60)
            this.age = age;
        else
            throw new PersonException("Illegal age, age must be between 20 to 60.");
    }
}
