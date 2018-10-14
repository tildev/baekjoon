package baekjoon.step08.q2292;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 10. 14.
 */
// 벌집
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10016 MB, 76 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(br.readLine());
        final int step = 6;
        int cnt = 1;
        int mul = 0;

        while (val > 0) {
            val -= cnt;
            mul += 1;
            cnt = mul * step;
        }
        System.out.println(mul);
    }
}
