package baekjoon.step03.q11022;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 04.
 */
// A+B - 8
// 메모리 제한, 시간 제한/ 256MB, 1초
// 16864 KB, 184 ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        bw.close();
    }
}
