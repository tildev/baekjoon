package baekjoon.step16.q3036;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 링
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11684 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 02. 12.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, gcd;
    private static int[] arr;

    // 최대공약수 (Greatest Common Divisor)
    private static int getGCD(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        arr[0] = Integer.valueOf(st.nextToken());
        for (int i = 1; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());

            gcd = getGCD(arr[0], arr[i]);

            bw.write((arr[0] / gcd) + "/" + (arr[i] / gcd) + "\n");
        }

        bw.flush();
        bw.close();
    }
}