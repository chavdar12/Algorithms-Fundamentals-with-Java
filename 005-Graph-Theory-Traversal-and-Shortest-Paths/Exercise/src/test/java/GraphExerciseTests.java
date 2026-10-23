import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Each program keeps its graph in static fields, so each main runs once per JVM.
public class GraphExerciseTests {

    @Test
    void salariesCountIsolatedEmployee() throws Exception {
        assertEquals("3\n", Console.run(Salaries::main, "3", "NYN", "NNN", "NNN"));
    }

    @Test
    void salariesWithNodeClass() throws Exception {
        assertEquals("5", Console.run(SalariesWithNodeclass::main, "4", "NNYN", "NNYN", "NNNN", "NYYN"));
    }

    @Test
    void distanceToSelfIsZero() throws Exception {
        assertEquals("{1, 2} -> 1\n{1, 1} -> 0\n{2, 1} -> -1\n\n",
                Console.run(DistanceBetweenVertices::main, "2", "3", "1:2", "2:", "1-2", "1-1", "2-1"));
    }

    @Test
    void acyclicGraph() throws Exception {
        assertEquals("Acyclic: Yes\n", Console.run(CyclesInGraph::main, "A-B", "B-C", "End"));
    }

    @Test
    void floodFill() throws Exception {
        assertEquals("xx\nxb\n", Console.run(TheMatrix::main, "2 2", "a a", "a b", "x", "0 0"));
    }

    @Test
    void bridges() throws Exception {
        assertEquals("Important streets:\n1 2\n0 1\n", Console.run(RoadReconstruction::main, "3", "2", "0 - 1", "1 - 2"));
    }

    @Test
    void areasInMatrix() throws Exception {
        assertEquals("Areas: 2\nLetter 'a' -> 1\nLetter 'b' -> 1\n", Console.run(AreasInMatrix::main, "2", "aa", "ab"));
    }
}
