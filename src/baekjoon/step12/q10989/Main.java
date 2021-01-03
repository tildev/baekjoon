package baekjoon.step12.q10989;

import java.io.*;

/**
 * 수 정렬하기 3
 * <p>
 * 해결 방법 으로는,
 * 1) Arrays.sort
 * 2) 계수 정렬 (counting sort) 이용
 * 이 있음.
 * <p>
 * * 계수 정렬 (counting sort) 이용
 * <p>
 * 메모리, 시간 제한  - 512 MB,    3 초
 * 메모리, 시간      - 295996 KB, 1620 ms
 *
 * @author tildev
 * @data 2020. 01. 04.
 */
public class Main {
    private static int n, num, numCnt;
    private static int[] existNumArr = new int[10_001];
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        /**
         * 입력 받을 수의 갯수(N)의 범위가 1 ≤ N ≤ 10,000,000 이지만,
         * 입력 받는 수의 범위는 "10,000보다 작거나 같은 자연수" 이므로,
         * 배열의 index는 1 ~ 10,000 이라는 숫자를 담을 수 있으면 된다.
         *
         */
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            existNumArr[num] += 1;
        }

        for (int i = 0; i < existNumArr.length; i++) {
            numCnt = existNumArr[i];
            for (int j = 0; j < numCnt; j++) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
