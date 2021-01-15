package baekjoon.step09.q3009;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 네 번쨰 점
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 11564 KB, 76 ms
 *
 * @author tildev
 * @data 2020. 01. 15.
 */
public class Main {
    private static int[] rectangleX = new int[4];
    private static int[] rectangleY = new int[4];
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            rectangleX[i] = Integer.parseInt(st.nextToken());
            rectangleY[i] = Integer.parseInt(st.nextToken());
        }
        if (rectangleX[0] == rectangleX[1]) {
            rectangleX[3] = rectangleX[2];
        } else if (rectangleX[0] == rectangleX[2]) {
            rectangleX[3] = rectangleX[1];
        } else {
            rectangleX[3] = rectangleX[0];
        }

        if (rectangleY[0] == rectangleY[1]) {
            rectangleY[3] = rectangleY[2];
        } else if (rectangleY[0] == rectangleY[2]) {
            rectangleY[3] = rectangleY[1];
        } else {
            rectangleY[3] = rectangleY[0];
        }

        bw.write(rectangleX[3] + " " + rectangleY[3]);
        bw.flush();
        bw.close();
    }
}
