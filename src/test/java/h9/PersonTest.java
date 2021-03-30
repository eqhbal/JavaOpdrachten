package h9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGC() throws InterruptedException {
        Person p = new Person("Jan", 45, Gender.MALE);
        System.out.println("1");
        p = null;
        System.out.println("2");
        System.gc();
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("4");
    }
}