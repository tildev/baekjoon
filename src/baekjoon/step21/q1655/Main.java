package baekjoon.step21.q1655;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 절댓값 힙
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 26512 KB, 340 ms
 *
 * @author tildev
 * @data 2020. 12. 06.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // 큰 수 pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 작은 수 pq
        PriorityQueue<Integer> pqReverse = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (pq.size() == pqReverse.size()) {
                pqReverse.add(num);
            } else {
                pq.add(num);
            }

            if (!pq.isEmpty() && !pqReverse.isEmpty()) {
                if (pq.peek() < pqReverse.peek()) {
                    int tmp = pq.poll();
                    pq.add(pqReverse.poll());
                    pqReverse.add(tmp);
                }
            }
            bw.write(pqReverse.peek() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
