package h10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void greet() {
        Teacher teacher = new Teacher();
        System.out.println(teacher.greet());
    }
}