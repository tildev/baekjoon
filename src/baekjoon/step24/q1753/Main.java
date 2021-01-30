package baekjoon.step24.q1753;

import java.io.*;
import java.util.*;

/**
 * 최단경로
 * <p>
 * 다익스트라 알고리즘
 * <p>
 * 메모리, 시간 제한  - 256 MB,    1 초
 * 메모리, 시간      - 118172 KB, 704 ms
 *
 * @author tildev
 * @data 2021. 01. 30.
 */
public class Main {

    private static int v, e, a, b, cost;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] distance;
    public static final int INF = 100_000_000;
    public static StringTokenizer st;

    private static List<List<Node>> list;

    private static class Node implements Comparable<Node> {
        int index, distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int compareTo(Node n) {
            return this.distance - n.distance;
        }
    }

    static void dijkstra(List<List<Node>> list, int[] distance, int start) {
        boolean[] visited = new boolean[v + 1];
        PriorityQueue<Node> pq = new PriorityQueue<Node>();

        distance[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            int now = pq.poll().index;

            if (visited[now]) continue;
            visited[now] = true;

            for (Node node : list.get(now)) {
                if (distance[node.index] > distance[now] + node.distance) {
                    distance[node.index] = distance[now] + node.distance;
                    pq.add(new Node(node.index, distance[node.index]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        // city
        v = Integer.parseInt(st.nextToken());
        // bus
        e = Integer.parseInt(st.nextToken());

        distance = new int[v + 1];
        list = new ArrayList<List<Node>>();

        int start = Integer.parseInt(br.readLine());

        list.add(new ArrayList<Node>());
        // init array
        Arrays.fill(distance, INF);
        for (int i = 1; i <= v; i++) {
            list.add(new ArrayList<Node>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());

            list.get(a).add(new Node(b, cost));
        }

        dijkstra(list, distance, start);

        // output
        for (int i = 1; i <= v; i++) {
            if (distance[i] == INF)
                bw.write("INF\n");
            else
                bw.write(distance[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

}
