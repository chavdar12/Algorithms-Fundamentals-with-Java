import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SearchingSortingGreedyTests {

    @Test
    void binarySearchFindsIndex() throws Exception {
        assertEquals("3\n", Console.run(BinarySearch::main, "1 2 3 4 5", "4"));
    }

    @Test
    void binarySearchMissingKey() throws Exception {
        assertEquals("-1\n", Console.run(BinarySearch::main, "1 2 3 4 5", "6"));
    }

    @Test
    void mergeSort() throws Exception {
        assertEquals("1 2 3 4 5\n", Console.run(MergeSort::main, "5 4 1 3 2"));
    }

    @Test
    void quicksort() throws Exception {
        assertEquals("1 2 2 3 5\n", Console.run(Quicksort::main, "5 2 1 3 2"));
    }

    @Test
    void bubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubblesortRecursive.sort(new int[]{4, 2, 3, 1}));
    }

    @Test
    void sumOfCoinsGreedy() {
        assertEquals(Map.of(50, 18, 20, 1, 2, 1, 1, 1), SumOfCoins.chooseCoins(new int[]{1, 2, 5, 10, 20, 50}, 923));
    }

    @Test
    void sumOfCoinsImpossible() {
        assertThrows(IllegalArgumentException.class, () -> SumOfCoins.chooseCoins(new int[]{2}, 3));
    }

    @Test
    void setCoverPicksLargestSetFirst() {
        List<int[]> sets = List.of(new int[]{1}, new int[]{2, 4}, new int[]{5}, new int[]{3});
        List<int[]> chosen = SetCover.chooseSets(sets, new int[]{1, 2, 3, 4, 5});
        assertEquals(4, chosen.size());
        assertArrayEquals(new int[]{2, 4}, chosen.get(0));
    }

    @Test
    void setCoverRejectsUncoverableUniverse() {
        assertThrows(IllegalArgumentException.class, () -> SetCover.chooseSets(List.of(new int[]{1}), new int[]{1, 2}));
    }
}
