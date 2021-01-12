package baekjoon.step25.q1450;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 냅색문제
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1 초
 * 메모리, 시간      - 17996 KB, 232 ms
 *
 * @author tildev
 * @data 2020. 01. 13.
 */
public class Main {

    private static int n, c;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static StringTokenizer st;

    private static void dfs(int s, int e, int sum, int[] arr, List<Integer> list) {
        if (sum > c) return;
        if (s > e) {
            list.add(sum);
            return;
        }
        dfs(s + 1, e, sum, arr, list);
        dfs(s + 1, e, sum + arr[s], arr, list);
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfs(0, n / 2 - 1, 0, arr, list1);
        Collections.sort(list1);

        dfs(n / 2, n - 1, 0, arr, list2);
        Collections.sort(list2);

        int cnt = 0;
        int e = list2.size() - 1;
        for (int s = 0; s < list1.size(); s++) {
            while (e >= 0 && list1.get(s) + list2.get(e) > c) {
                e--;
            }
            cnt += e + 1;
        }
        bw.write(cnt + "");


        bw.flush();
        bw.close();
    }

}
