import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathTests {

    @Test
    void findsShortestPath() throws Exception {
        assertEquals("Shortest path length is: 2\n1 3 4 \n",
                Console.run(ShortestPath::main, "4", "4", "1 2", "2 3", "1 3", "3 4", "1", "4"));
    }
}
