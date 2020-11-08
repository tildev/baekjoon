package baekjoon.step05.q3052;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 나머지
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11556 KB, 76 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {
    private static final int NUM_COUNT = 10;
    private static final int DIVISOR = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < NUM_COUNT; i++) {
            int num = Integer.parseInt(br.readLine());
            resultSet.add(num % DIVISOR);
        }

        bw.write(resultSet.size() + "");

        bw.flush();
        bw.close();
    }
}
