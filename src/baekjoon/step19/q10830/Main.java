package baekjoon.step19.q10830;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 행렬 제곱 - FAIL
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2021. 01. 24.
 */
public class Main {
    private static int n, b;
    private static long[][] a, imp, result;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static long[][] multi(long[][] a, long[][] b) {
        imp = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    imp[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return imp;
    }


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        a = new long[n][n];
        result = new long[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Long.parseLong(st.nextToken());
                result[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < b; i++) {
            result = multi(result, a);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(result[i][j] % 1000 + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
