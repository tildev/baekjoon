package baekjoon.step05.q10818;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 89140 KB, 588 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int min = num;
        int max = num;
        for (int i = 0; i < n - 1; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
