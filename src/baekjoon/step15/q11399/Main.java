package baekjoon.step15.q11399;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * step15 그리디 알고리즘
 * ATM
 * <p>
 * 메모리, 시간 제한  - 256  MB,  1초
 * 메모리, 시간      - 11916 KB, 88 ms
 *
 * @author tildev
 * @data 2021. 02. 06.
 */
public class Main {

    private static int n, sumTime = 0;
    private static int[] p;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(p);

        for (int i = 0; i < n; i++) {
            sumTime += p[i] * (n - i);
        }
        bw.write(sumTime + "");

        bw.flush();
        bw.close();
    }
}
