import java.util.*;
class GraphMatrix {
    int V;
    int[][] adjMatrix;

    GraphMatrix(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // For undirected graph
    }

    void display() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
               System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    void removeEdge(int u, int v) {
        adjMatrix[u][v] = 0;
        adjMatrix[v][u] = 0; // For undirected graph
    }
}
public class Graphbase {
    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.display();
        g.removeEdge(0, 1);
        System.out.println("After removing edge (0, 1):");
        g.display();
    }
    
}