import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinMaxFinderTest {
    @Test
    public void testFindMinMax() {
        int[] result = MinMaxFinder.findMinMax(new int[]{56, 34, 7, 3, 54, 3, 34, 34, 53});
        int[] expected = {3, 56};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindMinMaxWithNegativeNumbers() {
        int[] result = MinMaxFinder.findMinMax(new int[]{56, -34, 7, -3, 54, -3, 34, -34, 53});
        int[] expected = {-34, 56};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindMinMaxWithSingleNumber() {
        int[] result = MinMaxFinder.findMinMax(new int[]{1});
        int[] expected = {1, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindMinMaxWithNegativeMaxValue() {
        int[] result = MinMaxFinder.findMinMax(new int[]{1, -2, 3, -4, 5});
        int[] expected = {-4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindMinMaxWithPositiveAndNegativeNumbers() {
        int[] result = MinMaxFinder.findMinMax(new int[]{56, 34, -7, 3, -54, 3, 34, 34, -53});
        int[] expected = {-54, 56};
        assertArrayEquals(expected, result);
    }
}