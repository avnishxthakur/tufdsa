import java.util.Scanner;

public class AdjacencyMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input number of vertices and edges
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        // 2. Construct adjacency matrix
        int[][] adjMatrix = new int[vertices][vertices];

        // Initialize matrix with 0
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }

        // Input edges
        System.out.println("Enter edges (source destination): ");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();

            // For undirected graph
            adjMatrix[src][dest] = 1;
            adjMatrix[dest][src] = 1;
        }

        // 3. Display adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}