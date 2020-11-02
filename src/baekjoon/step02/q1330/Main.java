package baekjoon.step02.q1330;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 02.
 */
// 두 수 비교하기
// 메모리 제한, 시간 제한/ 512MB, 1초
// 14668 KB, 148 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        if (a > b) {
            bw.write(">");
        } else if (a < b) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        bw.close();
    }
}