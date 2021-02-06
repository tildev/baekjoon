package baekjoon.step15.q11047;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step15 그리디 알고리즘
 * 동전 0
 * <p>
 * 메모리, 시간 제한  - 256  MB,  1초
 * 메모리, 시간      - 11620 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 02. 06.
 */
public class Main {

    private static int n, k, coinCnt = 0;
    private static int[] coinArr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        coinArr = new int[n];
        for (int i = 0; i < n; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (k < coinArr[i]) {
                continue;
            }

            coinCnt += k / coinArr[i];
            k %= coinArr[i];

            if (k == 0) {
                break;
            }
        }
        bw.write(coinCnt + "");

        bw.flush();
        bw.close();
    }
}
