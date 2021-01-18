package baekjoon.step09.q4948;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 베르트랑 공준
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      - 13224 KB, 140 ms
 *
 * @author tildev
 * @data 2020. 01. 18.
 */
public class Main {
    private static int n, max = 1;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> nList = new ArrayList<>();

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            if (max < n) {
                max = n;
            }
            nList.add(n);
        }

        boolean[] noPrimeNumber = new boolean[2 * max + 1];

        noPrimeNumber[0] = noPrimeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(max * 2); i++) {
            if (noPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j <= max * 2; j += i) {
                noPrimeNumber[j] = true;
            }
        }

        for (int nn : nList) {
            int cnt = 0;
            for (int i = nn + 1; i <= nn * 2; i++) {
                if (!noPrimeNumber[i]) {
                    cnt += 1;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}
