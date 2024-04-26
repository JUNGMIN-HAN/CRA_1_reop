import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void getSum() {
        Main main = new Main();
        assertEquals(5,main.getSum(2,3));
    }
}