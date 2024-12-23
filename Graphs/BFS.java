import java.util.*;

public class BFS {
    public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        // The adjacency list will be given in most questions.
        // To practice, try creating an adjacency list yourself.


        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        // Start with the first node (assumed to be 0) and mark it as visited.
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            // Iterate through all neighbors of the dequeued node.
            for (int neighbor : adj.get(node)) {
                // If the neighbor hasn't been visited, mark it as visited and enqueue it.
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return bfs;
    }
}
