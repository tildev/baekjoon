package baekjoon.step05.q2577;

import java.io.*;

/**
 * 숫자의 개수
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11560 KB, 80 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;

        int arr[] = new int[ARRAY_LENGTH];
        while (result != 0) {
            arr[result % ARRAY_LENGTH]++;
            result /= 10;
        }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
