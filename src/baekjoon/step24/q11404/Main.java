package baekjoon.step24.q11404;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 플로이드
 * <p>
 * 플로이드 와샬 알고리즘 이용
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      - 44276 KB, 400 ms
 *
 * @author tildev
 * @data 2020. 01. 03.
 */
public class Main {

    private static int n, m, a, b, c;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[][] distance;
    public static final int INF = 100 * 100001;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // city
        n = Integer.parseInt(br.readLine());
        // bus
        m = Integer.parseInt(br.readLine());

        distance = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                distance[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            distance[a][b] = Math.min(distance[a][b], c);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    distance[i][j] = Math.min(distance[i][j], (distance[i][k] + distance[k][j]));
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (distance[i][j] >= INF) {
                    bw.write("0 ");
                } else {
                    bw.write(distance[i][j] + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

}
