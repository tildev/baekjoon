package baekjoon.step16.q1037;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 약수
 * <p>
 * 메모리, 시간 제한  - 512 MB,   2초
 * 메모리, 시간      - 11632 KB, 76 MS
 *
 * @author tildev
 * @data 2021. 02. 09.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, temp, min = 1_000_001, max = 1;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            temp = Integer.valueOf(st.nextToken());
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }

        bw.write(min * max + "");

        bw.flush();
        bw.close();
    }
}