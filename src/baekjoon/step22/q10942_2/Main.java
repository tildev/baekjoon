package baekjoon.step22.q10942_2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 팰린드롬?
 * 메모리, 시간 제한  - 256 MB,    2.5초
 * 메모리, 시간      - 217108 KB, 744 ms
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

        boolean palindromeDp[][] = new boolean[n][n];

        // 길이가 1
        for (int i = 0; i < n; i++) {
            palindromeDp[i][i] = true;
        }

        // 길이가 2
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                palindromeDp[i][i + 1] = true;
            }
        }

        // 길이가 3 이상
        for (int len = 2; len < n; len++) {
            for (int j = 0; j < n - len; j++) {
                if (arr[j] == arr[j + len] && palindromeDp[j + 1][len + j - 1]) {
                    palindromeDp[j][j + len] = true;
                }
            }
        }
        
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken()) - 1;

            if (palindromeDp[s][e]) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
