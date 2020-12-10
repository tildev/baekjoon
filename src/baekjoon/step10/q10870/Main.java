package baekjoon.step10.q10870;

import java.io.*;

/**
 * 팩토리얼
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 11576 KB, 88 ms
 *
 * @author tildev
 * @data 2020. 12. 11.
 */
public class Main {

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(fibo(n) + "\n");

        bw.flush();
        bw.close();
    }
}
