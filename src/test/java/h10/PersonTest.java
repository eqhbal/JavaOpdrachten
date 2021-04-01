package h10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void greet() {
        Person p = new Person("Tim", 25);
        System.out.println(p.greet());

    }
}