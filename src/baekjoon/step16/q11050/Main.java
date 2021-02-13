package baekjoon.step16.q11050;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 이항 계수 1
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 11612 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 02. 13.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, k;

    // 팩토리얼
    private static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.valueOf(st.nextToken());
        k = Integer.valueOf(st.nextToken());

        bw.write(fac(n) / (fac(n - k) * fac(k)) + "\n");

        bw.flush();
        bw.close();
    }
}