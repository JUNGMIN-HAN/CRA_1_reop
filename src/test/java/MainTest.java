import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void getGop() {
        int a = 5;
        int b = 10;
        Main main = new Main();

        int result = main.getGop(a, b);

        assertEquals(50, result);
    }
}