package baekjoon.step09.q9020;

import java.io.*;

/**
 * 골드바흐의 추측
 * <p>
 * 메모리, 시간 제한  - 256 MB,   2 초
 * 메모리, 시간      - 14244 KB, 136 ms
 *
 * @author tildev
 * @data 2020. 01. 18.
 */
public class Main {
    private static int t, n, max = 4;
    private static int[] nArr;
    private static boolean[] noPrimeNumber;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        nArr = new int[t];
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            if (max < n) {
                max = n;
            }
            nArr[i] = n;
        }

        noPrimeNumber = new boolean[max + 1];

        noPrimeNumber[0] = noPrimeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (noPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j <= max; j += i) {
                noPrimeNumber[j] = true;
            }
        }

        for (int nn : nArr) {
            for (int i = nn / 2; i > 1; i--) {
                if (!noPrimeNumber[i]) {
                    if ((nn - i) < noPrimeNumber.length && !noPrimeNumber[nn - i]) {
                        bw.write(i + " " + (nn - i) + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
