package baekjoon.step12.q1427;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 소트인사이드
 * <p>
 * 메모리, 시간 제한  - 128 MB,   2 초
 * 메모리, 시간      - 11668 KB, 92 ms
 *
 * @author tildev
 * @data 2020. 01. 05.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        List<Integer> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(Integer.parseInt(String.valueOf(c)));
        }

        Collections.sort(list, Collections.reverseOrder());

        for (Integer l : list) {
            bw.write(l + "");
        }

        bw.flush();
        bw.close();
    }
}
