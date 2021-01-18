package baekjoon.step09.q1002;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 터렛
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2 초
 * 메모리, 시간      - 11860 KB, 80 ms
 *
 * @author tildev
 * @data 2020. 01. 18.
 */
public class Main {
    private static int t, x1, y1, r1, x2, y2, r2;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            // 원이 겹쳐질때
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                bw.write("-1\n");
            } else {
                int distancePow = (int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2);

                // 원 두개가 닿지 않음
                if (distancePow > Math.pow(r2 + r1, 2)) {
                    bw.write("0\n");
                }
                // 원 하나 안에 원 하나가 포함 되어 닿지 않음
                else if (distancePow < Math.pow(r2 - r1, 2)) {
                    bw.write("0\n");
                }
                // 원이 외접함
                else if (distancePow == Math.pow(r2 + r1, 2)) {
                    bw.write("1\n");
                }
                // 원이 내접함
                else if (distancePow == Math.pow(r2 - r1, 2)) {
                    bw.write("1\n");
                }
                // 위의 어떤 경우에도 포함되지 않음 -> 원이 교차함
                else {
                    bw.write("2\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
