package baekjoon.step02.q14681;

import java.io.*;

/**
 * @author tildev
 * @data 2020. 11. 02.
 */
// 사분면 고르기
// 메모리 제한, 시간 제한/ 512MB, 1초
// 14400 KB, 144 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.valueOf(br.readLine());
        int y = Integer.valueOf(br.readLine());

        if (x > 0) {
            if (y > 0) {
                bw.write("1");
            } else {
                bw.write("4");
            }
        } else {
            if (y > 0) {
                bw.write("2");
            } else {
                bw.write("3");
            }
        }
        bw.close();
    }
}