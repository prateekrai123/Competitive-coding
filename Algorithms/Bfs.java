import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v = sc.nextInt();
        LinkedList<Integer> adj[] = new LinkedList[v];
        int e = sc.nextInt();
        System.out.println("Enter" + " " + e + " edges");
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        while (e-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        int parent[] = new int[v];

        System.out.println("Enter the souce and destination to search");
        int source = sc.nextInt();
        int destination = sc.nextInt();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == destination) {
                break;
            }

            for (int n : adj[cur]) {
                if (!vis[n]) {
                    q.add(n);
                    parent[n] = cur;
                    vis[n] = true;
                }
            }
        }

        int distance = 0;

        int cur = destination;

        while (parent[cur] != -1) {
            System.out.print(cur + " -> ");
            cur = parent[cur];
            distance++;
        }
        System.out.print(cur);
        System.out.println();
        System.out.println(distance);
    }
}
