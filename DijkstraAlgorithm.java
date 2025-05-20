public class DijkstraAlgorithm {

    public void dijkstraAlgorithm(int[][] graph, int source) {
        int nodes = graph.length;
        boolean[] visited_vertex = new boolean[nodes];
        int[] dist = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            visited_vertex[i] = false;
            dist[i] = Integer.MAX_VALUE;
        }

        dist[source] = 0;
        for (int i = 0; i < nodes; i++) {

            int u = find_min_distance(dist, visited_vertex);
            visited_vertex[u] = true;

            for (int v = 0; v < nodes; v++) {
                if (!visited_vertex[v] && graph[u][v] != 0 && (dist[u] +
                        graph[u][v] < dist[v])) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(String.format("Distance from Vertex %s to Vertex %s is %s", source, i, dist[i]));
        }
    }

    private static int find_min_distance(int[] dist, boolean[] visited_vertex) {
        int minimum_distance = Integer.MAX_VALUE;
        int minimum_distance_vertex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited_vertex[i] && dist[i] < minimum_distance) {
                minimum_distance = dist[i];
                minimum_distance_vertex = i;
            }
        }
        return minimum_distance_vertex;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] {
                { 0, 1, 1, 2, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 3, 0 },
                { 1, 2, 0, 1, 3, 0, 0 },
                { 2, 0, 1, 0, 2, 0, 1 },
                { 0, 0, 3, 0, 0, 2, 0 },
                { 0, 3, 0, 0, 2, 0, 1 },
                { 0, 2, 0, 1, 0, 1, 0 }
        };

        DijkstraAlgorithm Test = new DijkstraAlgorithm();

        Test.dijkstraAlgorithm(graph, 0);
    }
}