package baekjoon.step05.q1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 9. 30.
 */
// 한수 
// 메모리 제한, 시간 제한/ 128MB, 2초
// 10016 KB, 80 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        if (n < 100) {
            System.out.println(n);
            return;
        }

        int cnt = 99;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 100; i <= n; i++) {
            a = i / 100;
            b = (i / 10) % 10;
            c = i % 10;

            if (a - b == b - c) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
