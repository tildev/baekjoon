package baekjoon.step14.q9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * step14 - 동적 계획법 1
 * 신나는 함수 실행
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 69988 KB, 1908 ms
 * <p>
 * 메모이제이션
 *
 * @author tildev
 * @data 2021. 02. 18.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int a, b, c;
    private static int[][][] memoization = new int[21][21][21];

    static int w(int a, int b, int c) {

        if ((0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20) && memoization[a][b][c] != 0) {
            return memoization[a][b][c];
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return memoization[20][20][20] = w(20, 20, 20);
        }

        if (a < b && b < c) {
            return memoization[a][b][c] =
                    w(a, b, c - 1)
                            + w(a, b - 1, c - 1)
                            - w(a, b - 1, c);
        }

        return memoization[a][b][c] =
                w(a - 1, b, c)
                        + w(a - 1, b - 1, c)
                        + w(a - 1, b, c - 1)
                        - w(a - 1, b - 1, c - 1);
    }

    public static void main(String[] args) throws IOException {

        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }
}