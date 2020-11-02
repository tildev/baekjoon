package baekjoon.step03.q10950;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 03.
 */
// A+B - 3
// 메모리 제한, 시간 제한/ 256MB, 1초
// 16356 KB, 164 ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            bw.write((a + b) + "\n");
        }
        bw.close();
    }
}
