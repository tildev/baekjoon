package baekjoon.step14.q11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 가장 긴 증가하는 부분 수열
 * 메모리, 시간 제한  - 512 MB,   1초
 * 메모리, 시간      - 12380 KB, 108 ms
 *
 * @author tildev
 * @data 2020. 12. 05.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        cnt[0] = 1;

        for (int i = 1; i < n; i++) {
            cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && cnt[i] <= cnt[j]) {
                    cnt[i] = cnt[j] + 1;
                }
            }
        }
        int maxCnt = cnt[0];
        for (int i = 1; i < n; i++) {
            if (maxCnt < cnt[i])
                maxCnt = cnt[i];
        }
        System.out.println(maxCnt);
    }
}
