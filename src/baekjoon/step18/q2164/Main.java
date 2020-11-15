package baekjoon.step18.q2164;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 카드2
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 23684 KB, 124 MS
 *
 * @author tildev
 * @data 2020. 11. 15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i < n + 1; i++) {
            dq.add(i);
        }

        while (dq.size() > 1) {
            dq.removeFirst();
            dq.add(dq.removeFirst());
        }
        System.out.println(dq.pop());
    }
}
