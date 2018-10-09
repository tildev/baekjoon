package baekjoon.step07.q5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 10. 9.
 */
// 다이얼
// 메모리 제한, 시간 제한/ 128MB, 1초
// 9972MB, 76ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C') {
                sum += 3;
            } else if (c == 'D' || c == 'E' || c == 'F') {
                sum += 4;
            } else if (c == 'G' || c == 'H' || c == 'I') {
                sum += 5;
            } else if (c == 'J' || c == 'K' || c == 'L') {
                sum += 6;
            } else if (c == 'M' || c == 'N' || c == 'O') {
                sum += 7;
            } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                sum += 8;
            } else if (c == 'T' || c == 'U' || c == 'V') {
                sum += 9;
            } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
