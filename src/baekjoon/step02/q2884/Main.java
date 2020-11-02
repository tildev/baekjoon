package baekjoon.step02.q2884;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 02.
 */
// 알람 시계
// 메모리 제한, 시간 제한/ 128MB, 1초
// 16740 KB, 172 ms
public class Main {
    private final static int MAX_HOUR = 24;
    private final static int MAX_MIN = 60;
    private final static int BEFORE_MIN = 45;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String time = br.readLine();
        StringTokenizer st = new StringTokenizer(time, " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if (min >= BEFORE_MIN) {
            min = min - BEFORE_MIN;
        } else {
            hour -= 1;
            if (hour < 0) {
                hour += MAX_HOUR;
            }
            min = MAX_MIN - BEFORE_MIN + min;
        }
        bw.write(hour + " " + min);

        bw.close();
    }
}