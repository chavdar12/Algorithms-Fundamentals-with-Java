import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicProgrammingExerciseTests {

    @Test
    void binomialIterative() throws Exception {
        assertEquals("10\n", Console.run(BinomialCoefficientsIterative::main, "5", "2"));
    }

    @Test
    void binomialRecursive() throws Exception {
        assertEquals("10\n", Console.run(BinomialCoefficientsRecursive::main, "5", "2"));
    }

    @Test
    void connectingCables() throws Exception {
        assertEquals("Maximum pairs connected: 2\n", Console.run(ConnectingCables::main, "1 3 2"));
    }

    @Test
    void dividingPresents() throws Exception {
        assertEquals("Difference: 0\nAlan:3 Bob:3\nAlan takes: 2 1\nBob takes the rest.\n",
                Console.run(DividingPresents::main, "1 2 3"));
    }

    @Test
    void longestZigZag() throws Exception {
        assertEquals("1 3 2 ", Console.run(LongestZigZagSubsequence::main, "1 3 2"));
    }

    @Test
    void minimumEditDistance() throws Exception {
        assertEquals("Minimum edit distance: 1\n", Console.run(MinimumEditDistance::main, "1", "1", "1", "abc", "abd"));
    }

    @Test
    void sumWithLimitedCoins() throws Exception {
        assertEquals("2\n", Console.run(SumWithLimitedCoins::main, "1 2 3 4", "5"));
    }

    @Test
    void sumWithUnlimitedCoins() throws Exception {
        assertEquals("4\n", Console.run(SumWithUnlimitedCoins::main, "1 2 5", "5"));
    }

    @Test
    void wordDifferences() throws Exception {
        assertEquals("Deletions and Insertions: 2\n", Console.run(WordDifferences::main, "abc", "abd"));
    }
}
