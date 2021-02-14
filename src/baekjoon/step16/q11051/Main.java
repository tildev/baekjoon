package baekjoon.step16.q11051;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 이항 계수 2
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 15720 KB, 96 ms
 * <p>
 * *팩토리얼 주의사항
 * 12! - int 범위를 넘어선다
 * 20! - long 범위를 넘어선다
 * <p>
 * nCr = n-1Cr-1 + n-1Cr
 * <p>
 * * using
 * 파스칼 삼각형의 원리
 * 메모이제이션
 *
 * @author tildev
 * @data 2021. 02. 14.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, k;
    private static int[][] cArr = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.valueOf(st.nextToken());
        k = Integer.valueOf(st.nextToken());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    cArr[i][j] = 1;
                } else {
                    cArr[i][j] = (cArr[i - 1][j - 1] + cArr[i - 1][j]) % 10_007;
                }
            }
        }


        bw.write(cArr[n][k] + "\n");

        bw.flush();
        bw.close();
    }
}