package baekjoon.step08.q10250;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ACM 호텔
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 12216 KB, 104 MS
 *
 * @author tildev
 * @data 2020. 11. 12.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String hwn = br.readLine();
            StringTokenizer st = new StringTokenizer(hwn, " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int y = n % h;
            String x;
            if (y == 0) {
                y = h;
                x = String.format("%02d", n / h);
            } else {
                x = String.format("%02d", n / h + 1);
            }
            System.out.println(y + x);
        }
    }
}
