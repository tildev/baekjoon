package baekjoon.step23.q1697;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 숨바꼭질
 * 메모리, 시간 제한  - 128 MB,   2 초
 * 메모리, 시간      - 15832 KB, 128 ms
 *
 * @author tildev
 * @data 2020. 12. 27.
 */
public class Main {

    private static int n, k;
    private static int[] visited = new int[100001];

    private static StringTokenizer st;

    private static LinkedList<Integer> queue = new LinkedList<>();

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n >= k) {
            bw.write((n - k) + "\n");
        } else {
            bfs();
        }

        bw.flush();
        bw.close();
    }

    /**
     * bfs
     */
    private static void bfs() throws IOException {
        queue.add(n);
        visited[n] = 1;

        while (queue.size() > 0) {
            int temp = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == k) {
                    bw.write(visited[temp] + "\n");
                    return;
                }

                if (next >= 0 && next < visited.length) {
                    if (visited[next] == 0) {
                        queue.add(next);
                        visited[next] = visited[temp] + 1;
                    }
                }
            }
        }
    }
}
