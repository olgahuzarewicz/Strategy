import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main main = new Main();

    @Test
    void addStrategy1() {
        Strategy s1 = new Strategy() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        int result = s1.add(1,2);

        assertEquals(3, result);
    }

    @Test
    void addStrategy2() {
        Strategy s1 = new Strategy() {
            @Override
            public int add(int a, int b) {
                String a1 = "" + a;
                String b1 = "" + b;
                return Integer.valueOf(a1 + b1);
            }
        };

        int result = s1.add(1,2);

        assertEquals(12, result);
    }
}