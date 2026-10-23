import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTests {

    @Test
    void factorialOfZeroIsOne() throws Exception {
        assertEquals("1\n", Console.run(RecursiveFactorial::main, "0"));
    }

    @Test
    void factorialDoesNotOverflowInt() throws Exception {
        assertEquals("2432902008176640000\n", Console.run(RecursiveFactorial::main, "20"));
    }

    @Test
    void arraySum() throws Exception {
        assertEquals("10\n", Console.run(RecursiveArraySum::main, "1 2 3 4"));
    }

    @Test
    void drawing() throws Exception {
        assertEquals("**\n*\n#\n##\n", Console.run(RecursiveDrawing::main, "2"));
    }

    @Test
    void zeroOneVectors() throws Exception {
        assertEquals("00\n01\n10\n11\n", Console.run(Generating_0_1_Vectors::main, "2"));
    }

    @Test
    void fibonacci() throws Exception {
        assertEquals("8\n", Console.run(RecursiveFibonacci::main, "5"));
    }

    @Test
    void pathsInLabyrinth() throws Exception {
        assertEquals("RRDD\nDDRR\n", Console.run(PathsInLabyrinth::main, "3", "3", "---", "-*-", "--e"));
    }

    @Test
    void eightQueensHas92Solutions() throws Exception {
        assertEquals(92, Console.run(EightQueensPuzzle::main).split("\n\n").length);
    }
}
