package baekjoon.step05.q2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 최댓값
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 14996 KB, 148 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {

    private static final int NUM_COUNT = 9;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num;
        int max = 0;
        int index = 0;
        for (int i = 0; i < NUM_COUNT; i++) {
            num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                index = i + 1;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "");
        bw.flush();
        bw.close();
    }
}
