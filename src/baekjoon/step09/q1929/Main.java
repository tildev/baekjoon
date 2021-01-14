package baekjoon.step09.q1929;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 소수 구하기
 * <p>
 * 메모리, 시간 제한  - 256 MB,   2 초
 * 메모리, 시간      - 22588 KB, 208 ms
 *
 * @author tildev
 * @data 2020. 01. 14.
 */
public class Main {

    private static int m, n;
    private static boolean[] noPrimeNumber;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        noPrimeNumber = new boolean[n + 1];
        noPrimeNumber[0] = noPrimeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(n + 1); i++) {
            if (noPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j < n + 1; j += i) {
                noPrimeNumber[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!noPrimeNumber[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
