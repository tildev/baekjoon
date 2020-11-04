package baekjoon.step17.q9012;

import java.io.*;

/**
 * @author tildev
 * @data 2020. 11. 05.
 */
// 괄호
// 메모리 제한, 시간 제한/ 128MB, 1초
// 14584 KB, 140 MS
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String ps = br.readLine();
            int vpsNum = 0;
            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    vpsNum += 1;
                } else if (ps.charAt(j) == ')') {
                    vpsNum -= 1;
                    if (vpsNum < 0) {
                        bw.write("NO");
                        bw.newLine();
                        break;
                    }
                }
            }
            if (vpsNum == 0) {
                bw.write("YES");
                bw.newLine();
            } else if (vpsNum > 0) {
                bw.write("NO");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
