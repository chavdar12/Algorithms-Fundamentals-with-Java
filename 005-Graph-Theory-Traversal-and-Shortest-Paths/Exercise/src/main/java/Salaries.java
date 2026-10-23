import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Salaries {

    private static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(rd.readLine());

        for (int i = 0; i < v; i++) {

            graph.add(new ArrayList<>());

            char[] relations = rd.readLine().toCharArray();

            for (int j = 0; j < v; j++) {

                if (relations[j] == 'Y') {

                    graph.get(i).add(j);
                }
            }
        }
        rd.close();

        boolean[] visited = new boolean[v];
        long[] salaries = new long[v];

        for (int i = 0; i < v; i++) {

            dfs(i, visited, salaries);
        }
        System.out.println(Arrays.stream(salaries).sum());
    }

    private static void dfs (int node, boolean[] visited, long[] salaries){

        if (visited[node]) {
            return;
        }

        visited[node] = true;

        for (Integer child : graph.get(node)) {

            dfs(child, visited, salaries);
        }

        salaries[node] = graph.get(node).isEmpty() ? 1 : graph.get(node).stream().mapToLong(c -> salaries[c]).sum();
    }
}