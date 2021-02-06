package baekjoon.step15.q11399_2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * step15 그리디 알고리즘
 * ATM
 * <p>
 * Counting Sort 사용하여 문제 풀이
 * <p>
 * 메모리, 시간 제한  - 256  MB,  1초
 * 메모리, 시간      - 11868 KB, 88 ms
 *
 * @author tildev
 * @data 2021. 02. 06.
 */
public class Main {

    private static int n, cnt = 0, sumTime = 0;
    private static int[] arr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        arr = new int[1001];
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 1; i < 1001; i++) {
            while (arr[i] > 0) {
                sumTime += i * (n - cnt);
                arr[i] -= 1;
                cnt++;
            }
            if (cnt == n) {
                break;
            }
        }
        bw.write(sumTime + "");

        bw.flush();
        bw.close();
    }
}
