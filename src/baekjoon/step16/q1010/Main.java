package baekjoon.step16.q1010;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 다리 놓기
 * <p>
 * 메모리, 시간 제한  - 128 MB,   0.5 초
 * 메모리, 시간      - 11944 KB, 80 ms
 * <p>
 * nCr = n-1Cr-1 + n-1Cr
 * <p>
 * * using
 * 파스칼 삼각형의 원리
 * 메모이제이션
 *
 * @author tildev
 * @data 2021. 02. 17.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int t, n, m;
    private static int[][] cArr = new int[30][30];

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 30; i++) {
            cArr[i][i] = 1;
            cArr[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                cArr[i][j] = (cArr[i - 1][j - 1] + cArr[i - 1][j]);
            }
        }

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            bw.write(cArr[m][n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}