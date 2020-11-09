package baekjoon.step05.q1546;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 평균
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 11844 KB, 84 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double max = 0;
        double sum = 0;
        double score = 0;
        for (int i = 0; i < n; i++) {
            score = Double.parseDouble(st.nextToken());
            if (max < score)
                max = score;
            sum += score;
        }
        bw.write((sum / max * 100) / n + "");

        bw.flush();
        bw.close();
    }
}
