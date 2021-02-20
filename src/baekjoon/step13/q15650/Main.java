package baekjoon.step13.q15650;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step13 - 백트래킹
 * N과 M (2)
 * <p>
 * 메모리, 시간 제한  - 512 MB,   1 초
 * 메모리, 시간      - 11608 KB, 76 ms
 * <p>
 *
 * @author tildev
 * @data 2021. 02. 20.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static int[] arr;

    /**
     * dfs
     *
     * @param start
     * @param depth
     * @throws IOException
     */
    private static void dfs(int start, int depth) throws IOException {
        if (depth == m) {
            for (int a : arr) {
                bw.write(a + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = start; i <= n; i++) {

            arr[depth] = i;
            dfs(i + 1, depth + 1);

        }
        return;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1, 0);

        bw.flush();
        bw.close();
    }
}