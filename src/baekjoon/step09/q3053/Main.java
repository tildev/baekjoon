package baekjoon.step09.q3053;

import java.io.*;

/**
 * 택시 기하학
 * <p>
 * 오차는 0.0001
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 11880 KB, 80 ms
 *
 * @author tildev
 * @data 2020. 01. 18.
 */
public class Main {
    private static int r;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        r = Integer.parseInt(br.readLine());
        System.out.format("%.6f\n", Math.PI * r * r);
        System.out.format("%.6f", r * r * 2d);
        bw.flush();
        bw.close();
    }
}
