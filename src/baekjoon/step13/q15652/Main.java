package baekjoon.step13.q15652;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step13 - 백트래킹
 * N과 M (4)
 * <p>
 * 메모리, 시간 제한  - 512 MB,    1 초
 * 메모리, 시간      -  KB,  ms
 * <p>
 *
 * @author tildev
 * @data 2021. 02. 22.
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
     * @param depth
     * @throws IOException
     */
    private static void dfs(int start, int depth) throws IOException {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
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