import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void getSum() {
        Main main = new Main();
        assertEquals(5,main.getSum(2,3));
    void getGop() {
        int a = 5;
        int b = 10;
        Main main = new Main();

        int result = main.getGop(a, b);

        assertEquals(50, result);
    }
}