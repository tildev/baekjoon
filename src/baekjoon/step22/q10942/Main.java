package baekjoon.step22.q10942;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 팰린드롬?
 * 메모리, 시간 제한  - 256 MB,    2.5초
 * 메모리, 시간      - 128336 KB, 1648 ms
 *
 * @author tildev
 * @data 2020. 12. 20.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken()) - 1;

            boolean isPalindrome = true;
            for (int j = s, k = e; j < k; j++, k--) {
                if (arr[j] != arr[k]) {
                    isPalindrome = false;
                    bw.write("0\n");
                    break;
                }
            }
            if (isPalindrome) {
                bw.write("1\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
