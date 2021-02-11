package baekjoon.step16.q1934;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 최소공배수
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 12404 KB, 96 ms
 *
 * @author tildev
 * @data 2021. 02. 11.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int t, a, b;

    // 최대공약수 (Greatest Common Divisor)
    private static int getGCD(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수 (Least Common Multiple)
    public static int getLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());

            a = Integer.valueOf(st.nextToken());
            b = Integer.valueOf(st.nextToken());

            bw.write(getLcm(a, b, getGCD(a, b)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}