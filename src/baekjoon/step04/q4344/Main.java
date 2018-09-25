package baekjoon.step04.q4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 9. 25.
 */
// 평균은 넘겠지
// 메모리 제한, 시간 제한/ 128MB, 1초
// 11816 KB, 112 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.valueOf(br.readLine());

        int sdCnt;
        double sdNum, avg;
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            sdCnt = Integer.valueOf(st.nextToken());
            int score[] = new int[sdCnt];
            avg = 0;
            for (int j = 0; j < sdCnt; j++) {
                score[j] = Integer.valueOf(st.nextToken());
                avg += score[j];
            }
            avg = avg / (double) sdCnt;
            sdNum = 0;
            for (int j = 0; j < sdCnt; j++) {
                if (score[j] > avg) {
                    sdNum += 1;
                }
            }
            bw.write(String.format("%.3f", (sdNum / (double) sdCnt * 100.0)) + "%\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
