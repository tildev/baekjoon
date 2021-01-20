package baekjoon.step10.q11729;

import java.io.*;

/**
 * 하노이 탑 이동 순서
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 94284 KB, 364 ms
 *
 * @author tildev
 * @data 2021. 01. 20.
 */
public class Main {
    private static int n, cnt = 0;
    private static StringBuilder sb = new StringBuilder();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void hanoi(int n, int from, int mid, int to) {
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        } else {
            // n-1 개를 A에서 B로 이동
            hanoi(n - 1, from, to, mid);

            // 1개를 A에서 C로 이동
            sb.append(from + " " + to + "\n");

            // n-1 개를 B에서 C로 이동
            hanoi(n - 1, mid, from, to);
        }
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n) - 1) + "\n");
        hanoi(n, 1, 2, 3);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
