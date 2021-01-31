package baekjoon.step26.q11779;

import java.io.*;
import java.util.*;

/**
 * 최소비용 구하기2
 * <p>
 * 메모리, 시간 제한  - 256  MB,  1초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2021. 01. 31.
 */
public class Main {

    private static final int INF = 1_000 * 100_000;
    private static int n, m, start, end, cost, cityCnt = 0;
    private static int[] costArr;
    private static int[] parentNodeArr;
    private static StringBuilder sb = new StringBuilder();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static List<List<Node>> busList;

    private static class Node implements Comparable<Node> {
        int index, cost;

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        public int compareTo(Node n) {
            return this.cost - n.cost;
        }
    }

    public static Stack<Integer> searchPath() {
        Stack<Integer> stack = new Stack<>();
        int now = end;

        while (now != start) {
            stack.push(now);
            cityCnt++;

            now = parentNodeArr[now];
        }
        stack.push(now);
        cityCnt++;

        return stack;
    }

    static void dijkstra(List<List<Node>> busList, int[] costArr, int start) {
        boolean[] visited = new boolean[n + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        costArr[start] = 0;

        while (!pq.isEmpty()) {
            int now = pq.poll().index;

            if (visited[now]) continue;
            visited[now] = true;

            for (Node node : busList.get(now)) {
                if (costArr[node.index] > costArr[now] + node.cost) {
                    costArr[node.index] = costArr[now] + node.cost;
                    pq.add(new Node(node.index, costArr[node.index]));

                    parentNodeArr[node.index] = now;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        costArr = new int[n + 1];
        Arrays.fill(costArr, INF);
        // 경로 추적을 위한 부모노드 정보
        parentNodeArr = new int[n + 1];

        // init array
        busList = new ArrayList<List<Node>>();
        for (int i = 0; i <= n; i++) {
            busList.add(new ArrayList<Node>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());

            busList.get(start).add(new Node(end, cost));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        dijkstra(busList, costArr, start);
        Stack<Integer> cityStack = searchPath();
        while (!cityStack.isEmpty()) {
            int city = cityStack.pop();
            sb.append(city + " ");
        }

        bw.write(costArr[end] + "\n");
        bw.write(cityCnt + "\n");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
