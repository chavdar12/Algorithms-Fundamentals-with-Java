import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicProgrammingLabTests {

    @Test
    void fibonacciOfOne() throws Exception {
        assertEquals("1\n", Console.run(Fibonacci::main, "1"));
    }

    @Test
    void fibonacciOfTen() throws Exception {
        assertEquals("55\n", Console.run(Fibonacci::main, "10"));
    }

    @Test
    void longestIncreasingSubsequence() throws Exception {
        assertEquals("3 5 7 8 9 11 ", Console.run(LongestIncreasingSubsequence::main, "3 14 5 12 15 7 8 9 11 10 1"));
    }

    @Test
    void longestIncreasingSubsequenceOfLongRun() throws Exception {
        String run = IntStream.rangeClosed(1, 40).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        assertEquals(run + " ", Console.run(LongestIncreasingSubsequence::main, run));
    }

    @Test
    void rodCutting() throws Exception {
        assertEquals("10\n2 2\n", Console.run(RodCutting::main, "0 1 5 8 9", "4"));
    }

    @Test
    void moveDownRight() throws Exception {
        assertEquals("[0, 0] [1, 0] [1, 1]\n", Console.run(MoveDownRight::main, "2", "2", "1 2", "3 4"));
    }
}
