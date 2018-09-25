package baekjoon.step04.q1110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @data 2018. 9. 25.
 */
// 더하기 사이클
// 메모리 제한, 시간 제한/ 128MB, 2초
// 9988 KB, 76 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        int newNum = num;
        int cnt = 0;
        while (true) {
            newNum = (newNum % 10) * 10 + (newNum / 10 + newNum % 10) % 10;
            cnt++;
            if (num == newNum) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
