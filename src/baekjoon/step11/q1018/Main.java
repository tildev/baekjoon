package baekjoon.step11.q1018;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 11772 KB, 84 ms
 *
 * @author tildev
 * @data 2021. 01. 26.
 */
public class Main {
    private static final int MIN_VALUE = 64;
    private static int n, m, min = 64;
    private static String s;
    private static boolean[][] arr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int cnt = 0;

        // 첫 번쨰 색
        boolean imp = arr[x][y];

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                // 색이 맞지 않을 경우 cnt 증가
                if (arr[i][j] != imp) {
                    cnt++;
                }
                // 색 바꾸기
                imp = (!imp);
            }
            // 색 바꾸기
            imp = (!imp);
        }

        // 첫 번째 값 기준으로 할 때의 cnt 와, 그 반대경우의 cnt 중에서 최소값을 구함
        cnt = Math.min(cnt, MIN_VALUE - cnt);

        // 최소값
        min = Math.min(min, cnt);
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // W = true, B = false
        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int nRow = n - 7;
        int mCol = m - 7;

        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                find(i, j);
            }
        }

        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}
