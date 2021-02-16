package baekjoon.step16.q1676;

import java.io.*;

/**
 * step16 - 정수론 및 조합론
 * 팩토리얼 0의 개수
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 11584 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 02. 16.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n, imp, cnt = 0;
    private static final int FIVE = 5;

    public static void main(String[] args) throws IOException {
        n = Integer.valueOf(br.readLine());

        for (int i = 1; i <= n; i++) {
            imp = i;
            while (imp % FIVE == 0) {
                cnt++;
                imp /= FIVE;
            }
        }
        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
    }
}
