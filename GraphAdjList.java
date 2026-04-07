import java.util.*;

public class GraphAdjList {
    private ArrayList<ArrayList<Integer>> adjList;
    private int vertices;

    // Constructor
    public GraphAdjList(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Insert edge (undirected)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Display adjacency list
    public void display() {
        System.out.println("\nAdjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input vertices
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        GraphAdjList graph = new GraphAdjList(v);

        // Input edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (source destination): ");
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();

            // Optional: basic validation
            if (src >= v || dest >= v || src < 0 || dest < 0) {
                System.out.println("Invalid edge! Try again.");
                i--;
                continue;
            }

            graph.addEdge(src, dest);
        }

        // Display
        graph.display();

        sc.close();
    }
}