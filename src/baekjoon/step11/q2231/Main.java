package baekjoon.step11.q2231;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 분해합
 * <p>
 * 메모리, 시간 제한  - 192 MB,   2초
 * 메모리, 시간      - 11592 KB, 76 ms
 *
 * @author tildev
 * @data 2021. 01. 22.
 */
public class Main {
    private static int n, result, imp;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        // 가능한 최소값, n - (n의 자리수 * 9) 부터 시작 하면 된다.
        for (int i = n - ((int) (Math.log10(n) + 1) * 9); i < n; i++) {
            result = imp = i;
            while (result > 0) {
                imp += result % 10;
                result = result / 10;
            }
            if (imp == n) {
                result = i;
                break;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
    }
}
