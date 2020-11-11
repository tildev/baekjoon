package baekjoon.step08.q2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 설탕 배달
 * 메모리, 시간 제한  - 128 MB,   0.35초
 * 메모리, 시간      - 11492 KB, 88 MS
 *
 * @author tildev
 * @data 2020. 11. 11.
 */
public class Main {
    private static final Integer BAG_5KG = 5;
    private static final Integer BAG_3KG = 3;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int count = 0;

        while (true) {
            if (n % BAG_5KG == 0) {
                count += (n / BAG_5KG);
                break;
            } else if (n < 0) {
                count = -1;
                break;
            }
            count += 1;
            n -= BAG_3KG;
        }
        System.out.println(count);
    }
}
