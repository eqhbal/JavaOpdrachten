package h8;

import h7.PersonHasDiedException;

import java.util.Objects;

public class Person {
    public static boolean numberOfPossibleGenders;
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gender = Gender.UNKNOWN;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static int numberOfPossibleGenders() {
        return Gender.values().length;
    }

    public void haveBirthday() {
        age++;
        if (age > 130) {
            throw new PersonHasDiedException(name + " had died");
        }
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") is " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return this.age  == person.getAge() &&
                this.gender == person.getGender() &&
                this.name.equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("method finalize is called.");
    }
}
