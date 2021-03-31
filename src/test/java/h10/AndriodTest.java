package h10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndriodTest {

    @Test
    void greet() {
        Andriod andriod = new Andriod();
        System.out.println(andriod.greet());
    }
}