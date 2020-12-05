package baekjoon.step20.q2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나무 자르기
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 191252 KB, 744 MS
 *
 * @author tildev
 * @data 2020. 12. 05.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Long[] tree = new Long[n];

        st = new StringTokenizer(br.readLine());

        long min = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            tree[i] = Long.parseLong(st.nextToken());
            if (tree[i] > max)
                max = tree[i];
        }

        long result = 0;
        while (min <= max) {
            long mid = (min + max) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (mid < tree[i]) {
                    sum += tree[i] - mid;
                }
            }
            if (sum >= m) {
                if (result < mid) {
                    result = mid;
                }
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(result);
    }
}
