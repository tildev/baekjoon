package baekjoon.step21.q11279;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 최대 힙
 * 메모리, 시간 제한  - 512 MB,   1초
 * 메모리, 시간      - 26200 KB, 332 ms
 *
 * @author tildev
 * @data 2020. 12. 05.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.size() == 0) {
                    bw.write("0\n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            } else {
                pq.add(x);
            }
        }

        bw.flush();
        bw.close();
    }
}
