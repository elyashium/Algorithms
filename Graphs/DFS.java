import java.util.*;

public class DFS {

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {

        //marking the current node as visited
        vis[node] = true;
        ans.add(node);

        //getting the neignour nodes

        for (int neigbour : adj.get(node)) {
            if (!vis[neigbour]) {
                dfs(neigbour, vis, adj, ans);
            }
        }

    }

    public ArrayList<Integer> depthGraph(int v, ArrayList<ArrayList<Integer>> adj) {

        boolean vis[] = new boolean[v];
        vis[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, vis, adj, ans);
        return ans;
    }
}
