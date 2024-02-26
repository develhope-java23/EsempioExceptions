import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testValidSum() throws NegativeElementException {
        int[] arr1 = {1, 2, 3};
        int result = Main.sumArray(arr1);
        assertEquals(6, result);
    }

    @Test
    public void testZeroSum() throws NegativeElementException {
        int[] arr = {0, 0};
        int result = Main.sumArray(arr);
        assertEquals(0, result);
    }
}