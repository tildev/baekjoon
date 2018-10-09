package baekjoon.step06.q10039;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 10. 9.
 */
// 평균 점수
// 메모리 제한, 시간 제한/ 128MB, 1초
// 9868MB, 76ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int avg = 0;
        int score = 0;
        for (int i = 0; i < 5; i++) {
            score = Integer.valueOf(br.readLine());
            if (score <= 40) {
                avg += 40;
            } else {
                avg += score;
            }
        }
        System.out.println(avg / 5);
    }
}
