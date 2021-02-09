package baekjoon.step16.q2609;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 최대공약수와 최소공배수
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11596 KB, 80 MS
 *
 * @author tildev
 * @data 2021. 02. 10.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int a, b;

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
        st = new StringTokenizer(br.readLine());

        a = Integer.valueOf(st.nextToken());
        b = Integer.valueOf(st.nextToken());

        int gcd = getGCD(a, b);
        bw.write(gcd + "\n");
        bw.write(getLcm(a, b, gcd) + "\n");

        bw.flush();
        bw.close();
    }
}