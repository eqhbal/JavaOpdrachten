package h10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void greet() {
        Employee e = new Employee();
        System.out.println(e.greet());
    }
}