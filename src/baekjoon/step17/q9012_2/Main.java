package baekjoon.step17.q9012_2;

import java.io.*;

/**
 * 괄호
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 14552 KB, 144 MS
 *
 * 이전에 푼 9012 풀이가 보기에 지저분 해서, 
 * 출력과 체크 로직을 분리.
 * ))(( 인 경우의 수 체크를 위한 boolean 추가 
 * 
 * @author tildev
 * @data 2020. 11. 05.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            boolean isVpn = true;
            int leftPsCnt = 0;
            int rightPsCnt = 0;

            String ps = br.readLine();

            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    leftPsCnt += 1;
                } else if (ps.charAt(j) == ')') {
                    rightPsCnt += 1;
                    if (leftPsCnt < rightPsCnt) {
                        isVpn = false;
                        break;
                    }
                }
            }
            if (isVpn && (leftPsCnt == rightPsCnt)) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
