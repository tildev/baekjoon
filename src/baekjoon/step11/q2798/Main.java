package baekjoon.step11.q2798;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 블랙잭
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11664 KB, 80 ms
 *
 * @author tildev
 * @data 2021. 01. 22.
 */
public class Main {
    private static int n, m;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static int cardSum(int n, int m, int[] arr) {
        int result = 0;
        int tmp;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    tmp = arr[i] + arr[j] + arr[k];
                    if (tmp == m) {
                        return m;
                    } else {
                        if (result < tmp && tmp < m) {
                            result = tmp;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(cardSum(n, m, arr) + "");
        bw.flush();
        bw.close();
    }
}
