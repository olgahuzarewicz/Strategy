import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main main = new Main();

    @Test
    void addStrategy1() {
        int result = main.addInt(1,2);

        assertEquals(3, result);
    }

    @Test
    void addStrategy2() {
        int result = main.addString(1,2);

        assertEquals(12, result);
    }
}