package baekjoon.step06.q8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 9. 30.
 */
// OX 퀴즈
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10144 KB, 84 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcCnt = Integer.valueOf(br.readLine());
        for (int i = 0; i < tcCnt; i++) {
            int sum = 0;
            int total = 0;
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    sum += 1;
                    total += sum;
                } else {
                    sum = 0;
                }
            }
            System.out.println(total);
        }
    }
}
