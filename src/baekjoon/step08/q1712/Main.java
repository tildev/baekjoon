package baekjoon.step08.q1712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균
 * 메모리, 시간 제한  - 128 MB,   0.35초
 * 메모리, 시간      - 11492 KB, 80 MS
 *
 * @author tildev
 * @data 2020. 11. 11.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());


        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }
    }
}
