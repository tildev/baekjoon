package baekjoon.step19.q10830;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 행렬 제곱
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      - 11664 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 01. 24.
 */
public class Main {
    private static int n;
    private static long b;
    private static int[][] a, imp, result;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int[][] pow(long b) {
        int[][] m, tmp = new int[n][n];

        if (b == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tmp[i][j] = a[i][j] % 1000;
                }
            }
            return tmp;
        }
        // b==1 이 아니면, b를 2로 나누어 재귀를 돌림 (분할)
        m = pow(b / 2);
        tmp = multi(m, m);

        if (b % 2 == 1) {
            m = multi(tmp, a);
            return m;
        } else {
            return tmp;
        }
    }

    private static int[][] multi(int[][] a, int[][] b) {
        imp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    imp[i][j] += (a[i][k] * b[k][j]);
                }
                imp[i][j] %= 1000;
            }
        }
        return imp;
    }


    public static void main(String[] args) throws IOException {
        // b의 범위가 크므로, long 값으로 받아야함. stringTokenizer 로 받아서는 안됨.
        String[] sArr = br.readLine().split(" ");
        n = Integer.parseInt(sArr[0]);
        b = Long.parseLong(sArr[1]);

        a = new int[n][n];
        result = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        result = pow(b);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
