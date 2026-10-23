import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinatoricsTests {

    @Test
    void nChooseK() throws Exception {
        assertEquals("10\n", Console.run(NChooseKCount::main, "5", "2"));
    }

    @Test
    void combinationsWithoutRepetition() throws Exception {
        assertEquals("A B\nA C\nB C\n", Console.run(CombinationsWithoutRepetition::main, "A B C", "2"));
    }

    @Test
    void combinationsWithRepetition() throws Exception {
        assertEquals("A A\nA B\nB B\n", Console.run(CombinationsWithRepetition::main, "A B", "2"));
    }

    @Test
    void variationsWithoutRepetition() throws Exception {
        assertEquals("A B\nA C\nB A\nB C\nC A\nC B\n", Console.run(VariationsWithoutRepetition::main, "A B C", "2"));
    }

    @Test
    void variationsWithRepetition() throws Exception {
        assertEquals("A A\nA B\nB A\nB B\n", Console.run(VariationsWithRepetition::main, "A B", "2"));
    }

    @Test
    void permutationsWithoutRepetition() throws Exception {
        assertEquals("A B C\nA C B\nB A C\nB C A\nC A B\nC B A\n", Console.run(PermutationsWithoutRepetition::main, "A B C"));
    }

    @Test
    void permutationsWithRepetitionAreUnique() throws Exception {
        String[] lines = Console.run(PermutationsWithRepetition::main, "A B B").split("\n");
        assertEquals(3, lines.length);
        assertEquals(Set.of("A B B", "B A B", "B B A"), Set.of(lines));
    }
}
