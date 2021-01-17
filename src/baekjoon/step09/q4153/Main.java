package baekjoon.step09.q4153;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 직각삼각형
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 11632 KB, 72 ms
 *
 * @author tildev
 * @data 2020. 01. 17.
 */
public class Main {

    private static int a, b, c, i, max;
    // rightTriangle
    private static int[] rTArr;

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            rTArr = new int[3];
            st = new StringTokenizer(br.readLine());
            rTArr[0] = Integer.parseInt(st.nextToken());
            rTArr[1] = Integer.parseInt(st.nextToken());
            rTArr[2] = Integer.parseInt(st.nextToken());

            if (rTArr[0] == 0) {
                break;
            }
            Arrays.sort(rTArr);

            if (rTArr[2] * rTArr[2] == rTArr[0] * rTArr[0] + rTArr[1] * rTArr[1]) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
