package baekjoon.step11.q1436;

import java.io.*;

/**
 * 영화감독 숌
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 158628 KB, 348 ms
 *
 * @author tildev
 * @data 2021. 01. 26.
 */
public class Main {
    private static int num = 666, cnt = 1;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        while (cnt != n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        bw.write(num + "");
        bw.flush();
        bw.close();
    }
}
