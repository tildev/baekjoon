package baekjoon.step11.q7568;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 덩치
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11648 KB, 76 ms
 *
 * @author tildev
 * @data 2021. 01. 22.
 */
public class Main {
    private static int n, rank;
    private static int[][] info;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        info = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // 키
            info[i][0] = Integer.parseInt(st.nextToken());
            //몸무게
            info[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (info[i][0] < info[j][0] && info[i][1] < info[j][1]) {
                    rank++;
                }
            }
            bw.write(rank + " ");
        }

        bw.flush();
        bw.close();
    }
}
