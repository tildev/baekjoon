package baekjoon.step10.q10872;

import java.io.*;

/**
 * 팩토리얼
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 11548 KB, 84 ms
 *
 * @author tildev
 * @data 2020. 12. 08.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
