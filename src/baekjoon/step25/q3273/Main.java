package baekjoon.step25.q3273;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 두 수의 합
 * <p>
 * 투 포인터
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 28616 KB, 300 ms
 *
 * @author tildev
 * @data 2020. 01. 11.
 */
public class Main {

    private static int n, x, sum, start, end, cnt = 0;
    private static int[] a;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        x = Integer.parseInt(br.readLine());

        Arrays.sort(a);

        start = 0;
        end = n - 1;

        while (start < end) {
            sum = a[start] + a[end];
            if (sum == x) {
                cnt += 1;
                start += 1;
                end -= 1;
            } else if (x > sum) {
                start += 1;
            } else {
                end -= 1;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
    }
}
