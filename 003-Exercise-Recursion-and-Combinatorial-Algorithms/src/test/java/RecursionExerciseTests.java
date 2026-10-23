import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Each program keeps output in static fields, so each main runs once per JVM.
public class RecursionExerciseTests {

    @Test
    void reverseArray() throws Exception {
        assertEquals("3 2 1 ", Console.run(ReverseArray::main, "1 2 3"));
    }

    @Test
    void nestedLoops() throws Exception {
        assertEquals("1 1 \n1 2 \n2 1 \n2 2 \n", Console.run(NestedLoops::main, "2"));
    }

    @Test
    void combinationsWithoutRepetition() throws Exception {
        assertEquals("1 2 \n1 3 \n2 3 \n", Console.run(CombinationsWithoutRepetition::main, "3", "2"));
    }

    @Test
    void combinationsWithRepetition() throws Exception {
        assertEquals("1 1 \n1 2 \n2 2 \n", Console.run(CombinationsWithRepetition::main, "2", "2"));
    }

    @Test
    void cinemaKeepsReservedSeats() throws Exception {
        assertEquals("Amy Peter George Rick\nAmy George Peter Rick\n",
                Console.run(Cinema::main, "Peter, Amy, George, Rick", "Amy - 1", "Rick - 4", "generate"));
    }

    @Test
    void schoolTeams() throws Exception {
        assertEquals("Linda, Amy, Katty, John, Bill\n", Console.run(SchoolTeams::main, "Linda, Amy, Katty", "John, Bill"));
    }

    @Test
    void connectedAreas() throws Exception {
        assertEquals("Total areas found: 2\nArea #1 at (0, 0), size: 2\nArea #2 at (0, 2), size: 2\n",
                Console.run(ConnectedAreasInMatrix::main, "2", "3", "-*-", "-*-"));
    }

    @Test
    void wordCruncher() throws Exception {
        assertEquals("a b\nab\n", Console.run(WordCruncher::main, "ab, a, b", "ab"));
    }

    @Test
    void towersOfHanoiTakesSevenStepsForThreeDisks() throws Exception {
        String out = Console.run(TowersOfHanoi::main, "3");
        assertTrue(out.contains("Step #7"));
        assertTrue(!out.contains("Step #8"));
        assertTrue(out.contains("Source: \nDestination: 3, 2, 1\nSpare: \n"));
    }
}
