import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main main = new Main();

    @Test
    void addStrategy1() {
        Strategy s1 = new AddingStrategy1();

        int result = main.add(1,2,s1);

        assertEquals(3, result);
    }

    @Test
    void addStrategy2() {
        Strategy s2 = new AddingStrategy2();

        int result = main.add(1,2, s2);

        assertEquals(12, result);
    }
}