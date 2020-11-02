package baekjoon.step02.q2753;

import java.io.*;

/**
 * @author tildev
 * @data 2020. 11. 02.
 */
// 윤년
// 메모리 제한, 시간 제한/ 128MB, 1초
// 14616 KB, 140 MS
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.valueOf(br.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.close();
    }
}