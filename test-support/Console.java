import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/** Runs a console program's main with the given stdin and returns what it printed. */
public final class Console {

    public interface Main {
        void run(String[] args) throws Exception;
    }

    public static String run(Main main, String... inputLines) throws Exception {
        InputStream in = System.in;
        PrintStream out = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        try {
            System.setIn(new ByteArrayInputStream((String.join("\n", inputLines) + "\n").getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(captured, true, StandardCharsets.UTF_8));
            main.run(new String[0]);
        } finally {
            System.setIn(in);
            System.setOut(out);
        }
        return captured.toString(StandardCharsets.UTF_8).replace("\r\n", "\n");
    }

    private Console() {
    }
}
