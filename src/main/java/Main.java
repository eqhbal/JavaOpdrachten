
import h7.Gender;
import h7.Person;


public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders());

        Person t = new Person ("Truus", 130, Gender.FEMALE);
        t.haveBirthday();

    }
}
