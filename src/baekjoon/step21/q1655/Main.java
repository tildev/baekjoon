package baekjoon.step21.q11286;

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

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqMinus = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.size() == 0 && pqMinus.size() == 0) {
                    bw.write("0\n");
                } else {
                    if (pq.size() == 0) {
                        bw.write(pqMinus.poll() + "\n");
                    } else if (pqMinus.size() == 0) {
                        bw.write(pq.poll() + "\n");
                    } else {
                        if (pq.peek() >= pqMinus.peek() * -1) {
                            bw.write(pqMinus.poll() + "\n");
                        } else {
                            bw.write(pq.poll() + "\n");
                        }
                    }
                }
            } else {
                if (x > 0) {
                    pq.add(x);
                } else {
                    pqMinus.add(x);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
