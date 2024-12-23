import java.util.*;

public class Representation {

    public static void main(String[] args) {

        // Two common ways to represent graphs in Java:

// 1. Adjacency Matrix Representation:
//    - Uses a 2D array of size NxN (where N is the number of vertices).
//    - A value of 1 (or the weight of the edge) indicates the presence of an edge between two vertices.
//    - Space Complexity: O(N^2), even for sparse graphs (with fewer edges).
//    - Suitable for dense graphs or when edge existence needs to be checked frequently.
//    - Not space-efficient for large, sparse graphs.

// 2. Adjacency List Representation:
//    - Uses an array or list of lists to store edges for each vertex.
//    - Each vertex has a list of its adjacent vertices (or pairs of adjacent vertices and weights).
//    - Space Complexity: O(V + 2M), where V is the number of vertices and M is the number of edges.
//      (2M accounts for bidirectional edges in an undirected graph).
//    - Efficient for sparse graphs with fewer edges.
//    - Suitable for scenarios where iterating over neighbors is required frequently.


        //Adjacency matrix represenatation

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        int[][] adjMatrix = new int[vertices][vertices];


        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();


            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Remove this for directed graph
        }


        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }


        //Adjacency List Representation

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();


        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

      
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u); // Remove this for directed graph
        }

        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

    }
}
