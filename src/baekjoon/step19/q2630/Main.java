package baekjoon.step19.q2630;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * step19 - 분할 정복
 * 색종이 만들기
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 15720 KB, 96 ms
 *
 * @author tildev
 * @data 2021. 02. 25.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n;
    private static int[][] cArr = new int[1001][1001];
    private static int[] cnt = new int[2];
    private static int[][] cPaper;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());

        cPaper = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                cPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(n, 0, 0);
        for (int n : cnt) {
            bw.write(n + "\n");
        }
        
        bw.flush();
        bw.close();
    }

    static void divide(int n, int y, int x) {
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++)
                if (cPaper[i][j] != cPaper[y][x]) {
                    divide(n / 2, y, x);
                    divide(n / 2, y + n / 2, x);
                    divide(n / 2, y, x + n / 2);
                    divide(n / 2, y + n / 2, x + n / 2);

                    return;
                }
        }

        cnt[cPaper[y][x]]++;
    }
}