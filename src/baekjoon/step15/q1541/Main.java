package baekjoon.step15.q1541;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step15 그리디 알고리즘
 * 잃어버린 괄호
 * <p>
 * 메모리, 시간 제한  - 128  MB,  2초
 * 메모리, 시간      - 11644 KB, 84 ms
 *
 * @author tildev
 * @data 2021. 02. 06.
 */
public class Main {
    private static boolean isStart = true;
    private static int sum = 0, tmp;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer stMinus, stPlus;

    public static void main(String[] args) throws IOException {
        stMinus = new StringTokenizer(br.readLine(), "-");
        while (stMinus.hasMoreTokens()) {
            stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            tmp = 0;
            while (stPlus.hasMoreTokens()) {
                tmp += Integer.parseInt(stPlus.nextToken());
            }
            if (isStart) {
                sum += tmp;
                isStart = false;
            } else {
                sum -= tmp;
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
