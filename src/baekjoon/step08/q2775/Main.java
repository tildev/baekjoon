package baekjoon.step08.q2775;

import java.io.*;

/**
 * 부녀회장이 될테야
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 11428 KB, 76 ms
 *
 * @author tildev
 * @data 2020. 01. 17.
 */
public class Main {
    private static int t, k, n;
    private static int[][] apart;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            k = 1 + Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            apart = new int[k][n];

            for (int a = 0; a < k; a++) {
                for (int b = 0; b < n; b++) {
                    if (b == 0) {
                        apart[a][b] = 1;
                    } else if (a == 0) {
                        apart[a][b] = b + 1;
                    } else {
                        apart[a][b] = apart[a - 1][b] + apart[a][b - 1];
                    }
                }
            }
            bw.write(apart[k - 1][n - 1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
