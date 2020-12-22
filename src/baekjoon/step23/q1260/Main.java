package baekjoon.step23.q1260;

import java.io.*;
import java.util.*;

/**
 * DFS와 BFS
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 17388 KB, 184 ms
 *
 * @author tildev
 * @data 2020. 12. 22.
 */
public class Main {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void recursionDFS(List<Integer>[] arrayList, int v, boolean[] visited) throws IOException {
        if (visited[v]) {
            return;
        }

        // first
        visited[v] = true;
        bw.write(v + " ");

        for (int vv : arrayList[v]) {
            if (!visited[vv]) {
                recursionDFS(arrayList, vv, visited);
            }
        }

    }

    private static void writeDFS(List<Integer>[] arrayList, int n, int v) throws IOException {
        // default - false
        boolean[] visited = new boolean[n + 1];
        recursionDFS(arrayList, v, visited);
    }

    private static void writeBFS(List<Integer>[] arrayList, int n, int v) throws IOException {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // default - false
        boolean[] visited = new boolean[n + 1];
        // first
        queue.add(v);
        visited[v] = true;

        while (queue.size() > 0) {
            v = queue.poll();
            bw.write(v + " ");

            for (int vv : arrayList[v]) {
                if (!visited[vv]) {
                    queue.add(vv);
                    visited[vv] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점의 개수
        int n = Integer.parseInt(st.nextToken());
        // 간선의 개수
        int m = Integer.parseInt(st.nextToken());
        // 시작할 정점의 번호
        int v = Integer.parseInt(st.nextToken());

        // 정점 번호는 1 부터 시작하므로
        List<Integer>[] arrayList = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }
        for (int i = 1; i < arrayList.length; i++) {
            Collections.sort(arrayList[i]);
        }
        writeDFS(arrayList, n, v);
        bw.write("\n");
        writeBFS(arrayList, n, v);
        bw.flush();
        bw.close();
    }
}
