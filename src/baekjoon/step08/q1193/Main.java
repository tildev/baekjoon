package baekjoon.step08.q1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 10. 14.
 */
// 분수찾기
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10020 KB, 76 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(br.readLine());
        int cnt = 1;
        while (val > cnt) {
            val -= cnt;
            cnt++;
        }
        if (cnt % 2 == 0) {
            System.out.println(val + "/" + (cnt + 1 - val));
        } else {
            System.out.println((cnt + 1 - val) + "/" + val);
        }
    }
}
