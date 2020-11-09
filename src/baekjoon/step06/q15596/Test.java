package baekjoon.step06.q15596;

import java.util.Arrays;

/**
 * 정수 N개의 합
 * 메모리, 시간 제한  - 512 MB,   0.1초
 * 메모리, 시간      - 424900 KB, 188 MS
 *
 * @author tildev
 * @data 2020. 11. 10.
 */
public class Test {

    public long sum(int[] a) {
        return Arrays.stream(a).asLongStream().sum();
    }
}
