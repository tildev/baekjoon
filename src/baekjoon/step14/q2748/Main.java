package baekjoon.step14.q2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 2
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11480 KB, 84 ms
 *
 * @author tildev
 * @data 2020. 12. 14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long sum = 1;
        long x1 = 0;
        long x2 = 1;

        for (int i = 1; i < n; i++) {
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        System.out.println(sum);
    }
}
