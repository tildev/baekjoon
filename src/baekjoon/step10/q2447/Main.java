package baekjoon.step10.q2447;

import java.io.*;

/**
 * 별 찍기 - 10
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2021. 01. 20.
 */
public class Main {
    private static int n, cnt = 0;
    private static char[][] arr;
    private static StringBuilder sb = new StringBuilder();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void star(int x, int y, int n, boolean isBlack) {
        if (isBlack) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        // 더 이상 쪼개지지않음
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }
        // n =27 이면 한 블록의 사이즈는 9, n =9 일 경우 한 블록의 사이즈는 3
        // size는 해당 블록의 한 칸을 담을 변수를 의미
        // cnt 는 별 출력 누적을 의미
        int size = n / 3;
        int cnt = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                cnt++;
                if (cnt == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());


        arr = new char[n][n];

        star(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
