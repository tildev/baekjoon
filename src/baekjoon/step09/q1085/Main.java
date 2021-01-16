package baekjoon.step09.q1085;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 직사각형에서 탈출
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2 초
 * 메모리, 시간      - 11604 KB, 80 ms
 *
 * @author tildev
 * @data 2020. 01. 16.
 */
public class Main {

    private static int x, y, w, h, minX, minY;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        minX = Math.min(x, w - x);
        minY = Math.min(y, h - y);

        bw.write(Math.min(minX, minY) + "");

        bw.flush();
        bw.close();
    }
}
