package baekjoon.step09.q11653;

import java.io.*;

/**
 * 소인수분해
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      - 11656 KB, 116 ms
 *
 * @author tildev
 * @data 2020. 01. 14.
 */
public class Main {

    private static int n, i;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        i = 2;
        while (n != 1) {
            if (n % i == 0) {
                bw.write(i + "\n");
                n /= i;
            } else {
                i++;
            }
        }
        bw.flush();
        bw.close();
    }
}
