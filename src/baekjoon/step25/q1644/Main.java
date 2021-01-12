package baekjoon.step25.q1644;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 소수의 연속합
 * <p>
 * 투 포인터
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2 초
 * 메모리, 시간      - 24616 KB, 176 ms
 *
 * @author tildev
 * @data 2020. 01. 12.
 */

public class Main {
    private static int n, sum, start, end, cnt = 0;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        boolean[] noPrimeNumberArr = new boolean[n + 1];
        noPrimeNumberArr[0] = noPrimeNumberArr[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (noPrimeNumberArr[i]) {
                continue;
            }
            for (int j = i * i; j < noPrimeNumberArr.length; j += i) {
                noPrimeNumberArr[j] = true;
            }
        }

        List<Integer> primeNumberList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (!noPrimeNumberArr[i]) {
                primeNumberList.add(i);
            }
        }

        start = end = primeNumberList.size() - 1;

        while (start >= 0) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                sum += primeNumberList.get(i);
            }
            if (sum == n) {
                cnt += 1;
                start -= 1;
                end -= 1;
            } else if (sum < n) {
                start -= 1;
            } else {
                end -= 1;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
    }
}
