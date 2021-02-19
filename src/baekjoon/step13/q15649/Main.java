package baekjoon.step13.q15649;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step13 - 백트래킹
 * N과 M (1)
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      -  KB,  ms
 * <p>
 * 백트래킹의 하나로 DFS, BFS 가 있음.
 *
 * @author tildev
 * @data 2021. 02. 19.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static int[] arr;
    private static boolean[] visited;

    /**
     * dfs
     *
     * @param n
     * @param m
     * @param depth
     * @throws IOException
     */
    private static void dfs(int n, int m, int depth) throws IOException {
        if (depth == m) {
            for (int a : arr) {
                bw.write(a + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);

                visited[i] = false;
            }
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0);

        bw.flush();
        bw.close();
    }
}