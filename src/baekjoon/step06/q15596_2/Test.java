package baekjoon.step06.q15596_2;

/**
 * 정수 N개의 합
 * 메모리, 시간 제한  - 512 MB,   0.1초
 * 메모리, 시간      - 422848 KB, 24 MS
 *
 * @author tildev
 * @data 2020. 11. 10.
 */
public class Test {

    public long sum(int[] a) {
        long sum = 0;
        for (int aa : a) {
            sum += aa;
        }
        return sum;
    }
}
