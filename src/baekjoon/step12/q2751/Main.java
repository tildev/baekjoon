package baekjoon.step12.q2751;

import java.io.*;

/**
 * 수 정렬하기 2
 * <p>
 * Arrays.sort 사용시, 시간 초과 발생.
 * <p>
 * 해결 방법으로는
 * 1) Collections.sort 사용
 * 2) 계수 정렬 사용
 * 이 두 가지가 있음. 그 중에서
 * <p>
 * * 계수 정렬 (counting sort) 이용
 * <p>
 * 메모리, 시간 제한  - 256 MB,    2 초
 * 메모리, 시간      - 125780 KB, 708 ms
 *
 * @author tildev
 * @data 2020. 01. 04.
 */
public class Main {
    private static int n, num;
    private static boolean[] existNum = new boolean[2_000_001];
    private static int DEFAULT_INDEX = 1_000_000;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        /**
         * -1,000,000 ~ 1,000,000
         * 죽, index = 0 은, -1,000,000 이라고 생각
         */
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine()) + DEFAULT_INDEX;
            existNum[num] = true;
        }

        for (int i = 0; i < existNum.length; i++) {
            if (existNum[i]) {
                bw.write(i - DEFAULT_INDEX + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
