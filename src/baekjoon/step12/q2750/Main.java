package baekjoon.step12.q2750;

import java.io.*;
import java.util.Arrays;

/**
 * 수 정렬하기
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 12024 KB, 96 ms
 *
 * @author tildev
 * @data 2020. 01. 03.
 */
public class Main {
    private static int n;
    private static int[] arr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int a : arr) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }

}
