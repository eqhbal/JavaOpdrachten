package h11;

import h10.Gender;
import h10.Human;
import h7.PersonHasDiedException;

import java.util.ArrayList;


public class Person extends Human {
    public static boolean numberOfPossibleGenders;
    private String name;
    private int age;
    private Gender gender;
    private ArrayList<HistoryRecord> historyRecords = new ArrayList<HistoryRecord>();

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

    public String greet(){
        return "Hello, my name is " + this.name + ". Nice to meet you!.";
    }

    //H11

    public void addHistory(String descr) {
        historyRecords.add(new HistoryRecord(descr));

    }

    public void printHistory() {
        for (int i = 0; i < historyRecords.size(); i++) {
            System.out.println(historyRecords.get(i));
        }

    }

    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }


    private class HistoryRecord {
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}
